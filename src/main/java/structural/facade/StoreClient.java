package structural.facade;

public class StoreClient {
    public static void main(String[] args) {
        OnlineStoreFacade storeFacade = new OnlineStoreFacade();
        boolean isOrderSuccessful = storeFacade.placeOrder("1234", 2, "Malcom X", 299.99);

        if (isOrderSuccessful) {
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Failed to place the order.");
        }
    }
}

