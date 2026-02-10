package ExtrasString;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; // Array to store frequency of each ASCII character

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        int maxFreq = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("The most frequent character is: '" + mostFrequent + "' with " + maxFreq + " occurrences.");

        sc.close();
    }
}
