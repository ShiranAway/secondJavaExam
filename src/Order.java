import java.util.List;

public abstract class Order {
    private String id;
    private String name;
    private String deliveryAddress;
    private List<Item> items;
    private Customer customer;
    private double totalPrice;
    private String paymentType;  // CREDIT CARD / CASH / CHECK / OTHER
    private String orderDate;

    public Order(String id, String name, String deliveryAddress,
                 List<Item> items, Customer customer, String paymentType, String orderDate) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.items = items;
        this.customer = customer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.totalPrice = calculateTotalPrice();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public List<Item> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    protected abstract double calculateTotalPrice();
}
