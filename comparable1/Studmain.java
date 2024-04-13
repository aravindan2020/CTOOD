package comparable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Studmain {

	public static void main(String[] args) {
		 ArrayList<Student> studentList = new ArrayList<>();
	        Scanner s=new Scanner(System.in);
	        System.out.println("enter the total no of students count");
	        int n=s.nextInt();
	        for(int i=0;i<n;i++)
	        {
	        System.out.println("enter the id: ");
	        int id=s.nextInt();
	        System.out.println("enter the name: ");
	        String name=s.next();
		    studentList.add(new Student(name, id));
	        }

	        // Using Comparable (sorting by name)
	        Collections.sort(studentList);
	        System.out.println("Sorted by Name (using Comparable):");
	        for (Student student : studentList) {
	            System.out.println(student);
	        }

	        // Using Comparator (sorting by ID)
	        Collections.sort(studentList, new IDcomparator());
	        System.out.println("\nSorted by ID (using Comparator):");
	        for (Student student : studentList) {
	            System.out.println(student);
	        }


	}

}
