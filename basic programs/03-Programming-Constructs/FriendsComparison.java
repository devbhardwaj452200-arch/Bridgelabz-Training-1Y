import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        // Find youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest friend.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest friend.");
        } else {
            System.out.println("Anthony is the youngest friend.");
        }

        // Find tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest friend.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest friend.");
        } else {
            System.out.println("Anthony is the tallest friend.");
        }

        sc.close();
    }
}
