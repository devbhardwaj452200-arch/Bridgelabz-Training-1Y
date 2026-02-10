package Extras1;
import java.util.Scanner;

public class MaximumOfThree {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = takeInput();
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        System.out.println("The maximum number is: " + max);

        sc.close();
    }

    // Function to take three integer inputs
    public static int[] takeInput() {
        int[] nums = new int[3];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();

        return nums;
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
}
