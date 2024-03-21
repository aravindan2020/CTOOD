package Files;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileReadingExample {

	public static void main(String[] args) {
		String fileName = "example1.txt";

        // Reading content from the file
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] bytes = new byte[1024];
            int bytesRead = fis.read(bytes);
            String content = new String(bytes, 0, bytesRead);
            System.out.println("Content read from the file: " + content);
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

	}

}
