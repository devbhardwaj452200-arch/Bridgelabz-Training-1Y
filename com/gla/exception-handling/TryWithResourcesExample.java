import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        // try-with-resources: resource declared inside try
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {

            // Read first line
            String firstLine = reader.readLine();

            // Print the first line
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty");
            }

        } catch (IOException e) {
            // Handle exception
            System.out.println("Error reading file");
        }
    }
}
