public class PaymentSystem {

    interface Payment {
        void pay(double amount);
    }

    static class UPI implements Payment {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI");
        }
    }

    static class CreditCard implements Payment {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card");
        }
    }

    static class Wallet implements Payment {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Wallet");
        }
    }

    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(1000);
        p2.pay(2500);
        p3.pay(500);
    }
}
