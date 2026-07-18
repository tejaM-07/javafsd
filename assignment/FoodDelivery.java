interface OrderService {
    void placeOrder(String item, double price);
    String getOrderDetails();
    void cancelOrder();
}

interface Billing {
    double calculateGST();
    void generateBill();
}

interface Loggable {
    void logActivity(String action);
}

//---------------- Pizza Hut ----------------

class PizzaHut implements OrderService, Billing, Loggable {

    private String item;
    private double price;
    private double gst;
    private String status = "Pending";

    public void placeOrder(String item, double price) {
        this.item = item;
        this.price = price;
        status = "Confirmed";

        System.out.println("Pizza Hut accepted your order.");
        logActivity("Order placed successfully.");
    }

    public String getOrderDetails() {
        return "Restaurant : Pizza Hut\nItem : " + item +
                "\nPrice : ₹" + price +
                "\nStatus : " + status;
    }

    public void cancelOrder() {
        status = "Cancelled";
        System.out.println("Pizza Hut order cancelled.");
        logActivity("Order cancelled.");
    }

    public double calculateGST() {
        gst = price * 0.05;
        return gst;
    }

    public void generateBill() {
        System.out.println("Pizza Hut Bill");
        System.out.println("GST : ₹" + gst);
        System.out.println("Total : ₹" + (price + gst));
    }

    public void logActivity(String action) {
        System.out.println("Log : " + action);
    }
}

//---------------- KFC ----------------

class KFC implements OrderService, Billing, Loggable {

    private String item;
    private double price;
    private double gst;
    private String status = "Pending";

    public void placeOrder(String item, double price) {
        this.item = item;
        this.price = price;
        status = "Confirmed";

        System.out.println("KFC accepted your order.");
        logActivity("Order placed successfully.");
    }

    public String getOrderDetails() {
        return "Restaurant : KFC\nItem : " + item +
                "\nPrice : ₹" + price +
                "\nStatus : " + status;
    }

    public void cancelOrder() {
        status = "Cancelled";
        System.out.println("KFC order cancelled.");
        logActivity("Order cancelled.");
    }

    public double calculateGST() {
        gst = price * 0.08;
        return gst;
    }

    public void generateBill() {
        System.out.println("KFC Bill");
        System.out.println("GST : ₹" + gst);
        System.out.println("Total : ₹" + (price + gst));
    }

    public void logActivity(String action) {
        System.out.println("Log : " + action);
    }
}

//---------------- Dominos ----------------

class Dominos implements OrderService, Billing, Loggable {

    private String item;
    private double price;
    private double gst;
    private String status = "Pending";

    public void placeOrder(String item, double price) {
        this.item = item;
        this.price = price;
        status = "Confirmed";

        System.out.println("Dominos accepted your order.");
        logActivity("Order placed successfully.");
    }

    public String getOrderDetails() {
        return "Restaurant : Dominos\nItem : " + item +
                "\nPrice : ₹" + price +
                "\nStatus : " + status;
    }

    public void cancelOrder() {
        status = "Cancelled";
        System.out.println("Dominos order cancelled.");
        logActivity("Order cancelled.");
    }

    public double calculateGST() {
        gst = price * 0.10;
        return gst;
    }

    public void generateBill() {
        System.out.println("Dominos Bill");
        System.out.println("GST : ₹" + gst);
        System.out.println("Total : ₹" + (price + gst));
    }

    public void logActivity(String action) {
        System.out.println("Log : " + action);
    }
}

//---------------- Main Class ----------------

public class FoodDelivery {

    public static void main(String[] args) {

        PizzaHut p = new PizzaHut();
        p.placeOrder("Veg Pizza", 500);
        System.out.println(p.getOrderDetails());
        System.out.println("GST : ₹" + p.calculateGST());
        p.generateBill();

        System.out.println("------------------------");

        KFC k = new KFC();
        k.placeOrder("Chicken Bucket", 800);
        System.out.println(k.getOrderDetails());
        System.out.println("GST : ₹" + k.calculateGST());
        k.generateBill();

        System.out.println("------------------------");

        Dominos d = new Dominos();
        d.placeOrder("Cheese Burst Pizza", 650);
        System.out.println(d.getOrderDetails());
        System.out.println("GST : ₹" + d.calculateGST());
        d.generateBill();
    }
}