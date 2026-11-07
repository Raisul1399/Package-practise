package customer;

class Customer {
    private String customerId;
    private String customerName;
    private String address;

    public Customer(String customerId, String customerName, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("Customer ID: %s | Name: %s | Address: %s", 
                customerId, customerName, address);
    }
}