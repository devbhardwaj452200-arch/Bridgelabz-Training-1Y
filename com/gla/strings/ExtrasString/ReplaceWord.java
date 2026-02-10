package ExtrasString;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified sentence: " + modifiedSentence);

        sc.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+"); // split sentence into words
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord; // replace the word
            } else {
                result += words[i]; // keep the original word
            }

            if (i != words.length - 1) {
                result += " "; // add space between words
            }
        }

        return result;
    }
}
