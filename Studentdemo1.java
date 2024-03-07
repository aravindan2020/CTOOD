package Array1;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentdemo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>(); // Create an ArrayList of Student objects
        boolean a = true;

        while (a) {
            System.out.println("1. Add student\n2. Search ID\n3. Search Name\n4. Sort by ID\n5. Update name based on ID\n6. Display");
            System.out.println("Enter your choice:");
            int ch = s.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter student ID:");
                    int n = s.nextInt();
                    System.out.println("Enter student name:");
                    String s3 = s.next();
                    studentList.add(new Student(n, s3)); // Add Student object to the ArrayList
                    break;

                case 2:
                    System.out.println("Enter the id to search");
                    int id1 = s.nextInt();
                    for (Student student : studentList) {
                        if (student.id == id1) {
                            System.out.println(student);
                            break; // Exit the loop after finding the student
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the name to search");
                    String h = s.next();
                    for (Student student : studentList) {
                        if (student.name.equals(h)) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 4:
                    // Implement sorting logic using a temporary variable and loops
                    for (int i = 0; i < studentList.size() - 1; i++) {
                        for (int j = 0; j < studentList.size() - i - 1; j++) {
                            if (studentList.get(j).id > studentList.get(j + 1).id) {
                                Student temp = studentList.get(j);
                                studentList.set(j, studentList.get(j + 1));
                                studentList.set(j + 1, temp);
                            }
                        }
                    }
                    System.out.println("Students sorted by ID:");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 5:
                    System.out.println("Enter the id to search");
                    int id2 = s.nextInt();
                    System.out.println("Enter the name to update");
                    String h1 = s.next();
                    for (int i = 0; i < studentList.size(); i++) {
                        Student student = studentList.get(i); // Get the student object at index i
                        if (student.id == id2) {
                            student.name = h1;
                            System.out.println("Student updated:");
                            System.out.println(student);
                            break; // Exit the loop after updating the student
                        }
                    }
                    break;

                case 6:
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

            }
        }

	}

	}


