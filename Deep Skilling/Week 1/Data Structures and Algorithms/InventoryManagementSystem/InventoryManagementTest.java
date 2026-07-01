public class InventoryManagementTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Keyboard", 25, 1200);
        Product p3 = new Product(103, "Mouse", 30, 700);

        // Add Products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Display Inventory
        inventory.displayInventory();

        // Update Product
        inventory.updateProduct(102, 40, 1500);

        // Delete Product
        inventory.deleteProduct(103);

        // Display Inventory Again
        inventory.displayInventory();

    }

}