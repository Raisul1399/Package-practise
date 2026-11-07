package store;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products;

    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added to inventory: " + product.getProductName());
    }

    public boolean removeProduct(String productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(productId)) {
                Product removed = products.remove(i);
                System.out.println("Removed from inventory: " + removed.getProductName());
                return true;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
        return false;
    }

    public void updateStock(String productId, int newQuantity) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setQuantityInStock(newQuantity);
                System.out.println("Updated stock for " + product.getProductName() + " to " + newQuantity);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    public void listProductsInStock() {
        System.out.println("\n--- Current Inventory in Stock ---");
        boolean hasStock = false;
        for (Product product : products) {
            if (product.getQuantityInStock() > 0) {
                System.out.println(product);
                hasStock = true;
            }
        }
        if (!hasStock) {
            System.out.println("No products currently in stock.");
        }
        System.out.println("----------------------------------");
    }
}