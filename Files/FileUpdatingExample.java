package Files;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileUpdatingExample {

	public static void main(String[] args) {
		String fileName = "example1.txt";
        String newContent = "Updated content.";

        // Updating content in the file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = newContent.getBytes();
            fos.write(bytes);
            System.out.println("Content updated successfully!");
        } catch (IOException e) {
            System.err.println("Error updating content in the file: " + e.getMessage());
        }

	}

}
