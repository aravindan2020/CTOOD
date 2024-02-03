package P1;

import java.util.Scanner;
//copy constructor
public class Person {
    String name;// instance variable
    int age;
    Person(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    //copy constructor
    Person(Person ob)//Person(p)
    {
    	this.name=ob.name;
    	this.age=ob.age;
    }
    public void m1()
    {
    	System.out.println(name);
    	System.out.println(age);
    }
    
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	String a=s.next();
    	int b=s.nextInt();
    	Person p=new Person(a,b);
    	Person p2=new Person(p);
    	Person p3=new Person(p);
    	p.m1();
    	p2.m1();
        p3.m1();
    }
}
