public class CourseFeeDiscount {
    public static void main(String[] args) {
        double courseFee = 125000;
        double discountRate = 10; // in percent

        double discountAmount = (discountRate / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("Original Course Fee = INR " + courseFee);
        System.out.println("Discount Amount (10%) = INR " + discountAmount);
        System.out.println("Discounted Price to Pay = INR " + discountedPrice);
    }
}
