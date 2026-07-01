public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Accessories"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Office")

        };

        System.out.println("===== Linear Search =====");

        Product result1 = SearchOperations.linearSearch(products, 103);

        if (result1 != null)
            result1.displayProduct();
        else
            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("===== Binary Search =====");

        Product result2 = SearchOperations.binarySearch(products, 104);

        if (result2 != null)
            result2.displayProduct();
        else
            System.out.println("Product Not Found");

    }

}