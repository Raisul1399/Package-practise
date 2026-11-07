import store.Product;
import store.InventoryManager;

public class Main {
    public static class Customer {
        private final String customerId;
        private final String name;
        private final String address;

        public Customer(String customerId, String name, String address) {
            this.customerId = customerId;
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Customer ID: " + customerId + "\nName: " + name + "\nAddress: " + address;
        }
    }

    public static void main(String[] args) {

        Product laptop = new Product("P001", "Laptop Pro 15", 1299.99, 10);
        Product mouse = new Product("P002", "Wireless Mouse", 29.50, 50);
        Product keyboard = new Product("P003", "Mechanical Keyboard", 89.99, 15);

        Customer customer1 = new Customer("C101", "Alice Johnson", "742 Evergreen Terrace");
        InventoryManager manager = new InventoryManager();

        System.out.println("=== Customer Details ===");
        System.out.println(customer1);

        System.out.println("\n=== Featured Product Details ===");
        System.out.println(laptop);
        System.out.println();

        manager.addProduct(laptop);
        manager.addProduct(mouse);
        manager.addProduct(keyboard);

        manager.listProductsInStock();

        System.out.println("\n=== Updating Inventory ===");
        manager.updateStock("P001", 8);
        manager.removeProduct("P002");

        manager.listProductsInStock();
    }
}