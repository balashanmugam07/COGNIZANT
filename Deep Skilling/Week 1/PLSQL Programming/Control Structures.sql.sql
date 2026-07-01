-- ============================================
-- STEP 1: CREATE TABLES
-- ============================================

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- ============================================
-- STEP 2: INSERT SAMPLE DATA
-- ============================================

INSERT INTO Customers VALUES (1,'Rahul',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Priya',35,9000,'FALSE');
INSERT INTO Customers VALUES (3,'Arun',70,20000,'FALSE');

INSERT INTO Loans VALUES (101,1,8,SYSDATE+10);
INSERT INTO Loans VALUES (102,2,9,SYSDATE+45);
INSERT INTO Loans VALUES (103,3,10,SYSDATE+20);

COMMIT;

-- ============================================
-- STEP 3: ENABLE OUTPUT
-- ============================================

SET SERVEROUTPUT ON;

-- ============================================
-- SCENARIO 1
-- Apply 1% Discount for Customers Above 60
-- ============================================

BEGIN
    FOR rec IN (
        SELECT c.CustomerID,
               c.Age,
               l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Scenario 1 Completed');
END;
/

-- Display Updated Loan Details

SELECT * FROM Loans;

-- ============================================
-- SCENARIO 2
-- Promote Customers to VIP
-- ============================================

BEGIN
    FOR rec IN (
        SELECT CustomerID,
               Balance
        FROM Customers
    )
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP='TRUE'
            WHERE CustomerID=rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Scenario 2 Completed');
END;
/

-- Display Updated Customer Details

SELECT * FROM Customers;

-- ============================================
-- SCENARIO 3
-- Loan Reminder
-- ============================================

BEGIN

    FOR rec IN (
        SELECT c.CustomerName,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID=l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE+30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
        'Reminder : Dear '
        ||rec.CustomerName||
        ', Your Loan ID '
        ||rec.LoanID||
        ' is due on '
        ||TO_CHAR(rec.DueDate,'DD-MON-YYYY')
        );

    END LOOP;

END;
/