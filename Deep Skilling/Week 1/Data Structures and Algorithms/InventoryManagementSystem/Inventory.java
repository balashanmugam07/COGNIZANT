import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {

        products.put(product.getProductId(), product);

        System.out.println(product.getProductName() + " added successfully.");
    }

    // Update Product
    public void updateProduct(int id, int quantity, double price) {

        Product product = products.get(id);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }

    }

    // Delete Product
    public void deleteProduct(int id) {

        if (products.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }

    }

    // Display Inventory
    public void displayInventory() {

        System.out.println("\nInventory Details");

        for (Product product : products.values()) {
            product.displayProduct();
        }

    }

}