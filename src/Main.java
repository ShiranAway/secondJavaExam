import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("001", "Laptop", 5000);
        Item item2 = new Item("002", "Mouse", 25);
        Item item3 = new Item("003", "SmartPhone", 6500);

        Customer customer = new Customer("1", "Shiran", "BenDavid", "B.D.Shiran@gmail.com",
                "44st New-York", Customer.CustomerType.VIP, 0.10);

        Order order = new VIPOrder("555", "firstOrder", "44st New-York",
                Arrays.asList(item1, item2), customer, "CREDIT CARD", "2024-08-29");

        customer.addFavoriteItem(item1);
        customer.addFavoriteItem(item2);
        customer.addFavoriteItem(item3);

        Gift gift = new Gift();
        customer.takeGift(gift);

        System.out.println("Total price: " + order.getTotalPrice());
        customer.openGift();
    }
}
