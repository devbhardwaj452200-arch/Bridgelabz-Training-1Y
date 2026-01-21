import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the triangle (in inches): ");
        float height = sc.nextFloat();
        float areaSqInches = 0.5f * base * height;
        float areaSqCm = areaSqInches * 2.54f * 2.54f;
        System.out.println("\nThe area of the triangle is "
                + areaSqInches + " square inches and "
                + areaSqCm + " square centimeters.");
        sc.close();}}
