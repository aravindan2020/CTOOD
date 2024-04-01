package Arithmetic1;

import java.io.*;

class Student implements Serializable {
    String name;
    int id;
    transient double gpa; // transient keyword to exclude GPA from serialization

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

       public String toString() {
        return "Student Name: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}