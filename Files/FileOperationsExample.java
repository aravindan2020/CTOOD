package Files;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOperationsExample {

	public static void main(String[] args) {
		String fileName = "example1.txt";
        String content = "Hello, world!";

        // Writing content to the file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Content written to the file successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

	}

}
