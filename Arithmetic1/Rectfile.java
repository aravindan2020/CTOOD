package Arithmetic1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rectfile {

	public static void main(String[] args) throws IOException {
		// File paths for input and output files
        String inputFile = "dimensions.txt";
        String outputFile = "surface_area.txt";

        // Reader for input file
        FileReader reader = new FileReader(inputFile);

        // Buffer to read characters
        BufferedReader br = new BufferedReader(reader);

        // w for output file
        FileWriter w = new FileWriter(outputFile);

        // Variables to store dimensions
        double length, breadth, height;

        try {
            // Read length from the file (assuming each dimension is on a separate line)
            length = Double.parseDouble(br.readLine());

            // Read breadth from the file
            breadth = Double.parseDouble(br.readLine());

            // Read height from the file
            height = Double.parseDouble(br.readLine());

            // Calculate surface area
            double surfaceArea = 2 * (length * breadth + breadth * height + length * height);

            // Write surface area details to the output file
            w.write("Surface Area of the Cuboid: " + surfaceArea + "\n");

        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found - " + inputFile);
        } catch (IOException e) {
            System.err.println("Error: IOException occurred while processing files.");
        } finally {
            // Close resources
            br.close();
            reader.close();
            w.close();
        }

	}

}
