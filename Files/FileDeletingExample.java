package Files;
import java.io.File;
public class FileDeletingExample {

	public static void main(String[] args) {
		String fileName = "example1.txt";

        // Deleting the file
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.err.println("Failed to delete the file.");
        }

	}

}
