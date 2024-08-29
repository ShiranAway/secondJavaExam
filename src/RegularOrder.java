import java.util.List;

public class RegularOrder extends Order {

    public RegularOrder(String id, String name, String deliveryAddress,
                        List<Item> items, Customer customer, String paymentType, String orderDate) {
        super(id, name, deliveryAddress, items, customer, paymentType, orderDate);
    }

    @Override
    protected double calculateTotalPrice() {
        double sum = 0;
        for (Item item : getItems()) {
            sum += item.getPrice();
        }
        return sum;
    }
}
