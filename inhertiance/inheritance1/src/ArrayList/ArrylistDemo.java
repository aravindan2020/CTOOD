package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrylistDemo {
	public static void main(String[] args) {
		int i,n;
		ArrayList<Student> a=new ArrayList<Student>();
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
		a.add(new Student(s.next(),s.nextInt()));
		}
		s.close();
		for(i=0;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
		
}
}
