package pro4;

import java.util.Scanner;

public class inp {

	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine(); 
    System.out.println("Enter password");

    String password = myObj.nextLine(); 
    // Read user input
    System.out.println("Username is: " + userName + " password is "+ password);  // Output user input
    myObj.close();	
    // TODO Auto-generated method stub

	}

}
