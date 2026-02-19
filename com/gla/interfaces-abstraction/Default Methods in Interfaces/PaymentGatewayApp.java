public class PaymentGatewayApp {

    interface PaymentProcessor {

        void pay(double amount);

        // New feature added later
        default void refund(double amount) {
            System.out.println("Refund of ₹" + amount + " initiated (Default Process)");
        }
    }

    static class PayPal implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using PayPal");
        }
    }

    static class Stripe implements PaymentProcessor {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Stripe");
        }

        // Overriding default method (optional)
        public void refund(double amount) {
            System.out.println("Refund of ₹" + amount + " processed via Stripe");
        }
    }

    public static void main(String[] args) {

        PaymentProcessor p1 = new PayPal();
        PaymentProcessor p2 = new Stripe();

        p1.pay(1000);
        p1.refund(500);  // Uses default method

        p2.pay(2000);
        p2.refund(1000); // Uses overridden method
    }
}
