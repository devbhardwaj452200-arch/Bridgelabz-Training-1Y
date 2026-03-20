import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // محاولة فتح الملف
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            // قراءة وطباعة محتويات الملف
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // التعامل مع الخطأ (Checked Exception)
            System.out.println("File not found");
        } finally {
            // إغلاق الملف (تنفيذ دائم)
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
