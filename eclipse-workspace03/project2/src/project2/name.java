package project2;

//import java.util.Scanner;
import java.io.*;

public class name {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		int number = Integer.parseInt(in.readLine());
        String name = in.readLine();  
        String name1 = in.readLine();
        System.out.println("Name is: " + name); 
        System.out.println("Name is: " + name1);
        System.out.println(number);
        in.close();             
        }

	}
