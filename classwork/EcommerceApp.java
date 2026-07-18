import java.util.*;

class Order {
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    // Parent constructor
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();

        System.out.println("Order created: " + orderId);
    }

    // Parent method
    public double calculateDiscount() {
        // Base discount: 5%
        return totalAmount * 0.05;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + totalAmount);
        System.out.println("Date: " + orderDate);
    }
}

// Child class
class PremiumOrder extends Order {

    private String membershipTier;
    private double cashback;

    // Child constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {

        super(orderId, totalAmount); // Must be first statement

        this.membershipTier = membershipTier;
        this.cashback = totalAmount * 0.10; // 10% cashback

        System.out.println("Cashback: " + cashback);
        System.out.println("Premium order with " + membershipTier + " membership");
    }

    // Method overriding
    @Override
    public double calculateDiscount() {

        double baseDiscount = super.calculateDiscount(); // Parent discount
        double premiumDiscount = totalAmount * 0.10;     // Extra 10%

        double finalDiscount = baseDiscount + premiumDiscount;

        System.out.println("Premium Discount Applied: " + finalDiscount);

        return finalDiscount;
    }

    @Override
    public void displayOrder() {

        super.displayOrder();

        System.out.println("Membership: " + membershipTier);
        System.out.println("Cashback: " + cashback);
    }
}

// Main class
public class EcommerceApp {

    public static void main(String[] args) {

        PremiumOrder order = new PremiumOrder("ORD123", 5000, "Gold");

        order.displayOrder();

        order.calculateDiscount();
    }
}