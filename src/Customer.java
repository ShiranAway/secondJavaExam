import java.util.ArrayList;
import java.util.List;

public class Customer {
    public enum CustomerType {
        REGULAR, VIP
    }

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType type;
    private Double discount;
    private List<Item> favoriteItems;
    private Gift gift;

    public Customer(String id, String firstName, String lastName,
                    String email, String deliveryAddress, CustomerType type, Double discount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.type = type;
        this.discount = discount;
        this.favoriteItems = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getType() {
        return type;
    }

    public Double getDiscount() {
        return discount;
    }

    public List<Item> getFavoriteItems() {
        return favoriteItems;
    }

    public void addFavoriteItem(Item item) {
        for (Item i : favoriteItems) {
            if (i.getName().equals(item.getName())) {
                return;
            }
        }
        favoriteItems.add(item);
    }

    public void removeFavoriteItem(Item item) {
        favoriteItems.removeIf(i -> i.getName().equals(item.getName()));
    }

    public void takeGift(Gift gift) {
        this.gift = gift;
    }

    public void openGift() {
        if (gift != null) {
            gift.openGift();
        } else {
            System.out.println("Sorry there is no gift...");
        }
    }
}

