package Array1;

import java.util.Scanner;

public class Studentdemo {

	public static void main(String[] args) {
		int i,count=0; 
		Student[] s1 =new Student[5];
		 Scanner s=new Scanner(System.in);
		 boolean a = true;
	        while (a) {
	            System.out.println("1. Add student\n2. Search ID\n3. Search Name\n4. Sort by ID\n 5. Update name based on ID\n6. Display");
	            System.out.println("Enter your choice:");
	            int ch = s.nextInt();
	            switch (ch) {
	            
	            case 1:
	            	if (count < s1.length) { // Check if array is not full
                        System.out.println("Enter student ID:");
                        int n = s.nextInt();
                        System.out.println("Enter student name:");
                        String s3 = s.next();
                        s1[count] = new Student(n, s3);
                        count++; // Increment count after adding student
                    } else {
                        System.out.println("Array is full!");
                    }
	            	break;
	            case 2:
	            	System.out.println("enter the id to search");
	            	int id1=s.nextInt();
	            	for(i=0;i<count;i++)
	            	{
	            		if(s1[i].id==id1)
	            		{
	            			System.out.println(s1[i]);
	            		}
	            	}
	            	break;
	            case 3:
	            	System.out.println("enter the name to search");
	            	String h=s.next();
	            	for(i=0;i<count;i++)
	            	{
	            		if(s1[i].name.equals(h))
	            		{
	            			System.out.println(s1[i]);
	            		}
	            	}
	            	break;
	             case 4:
	            	for (i = 0; i < count - 1; i++) {
	                    for (int j = 0; j < count - i - 1; j++) {
	                        if (s1[j].id > s1[j + 1].id) {
	                            Student temp = s1[j];
	                            s1[j] = s1[j + 1];
	                            s1[j + 1] = temp;
	                        }
	                    }
	            	}
	            	for (i = 0; i < count; i++)
	            	{
	            		System.out.println(s1[i]);
	            	}
	            	break;
	             case 5:
	            	 System.out.println("enter the id to search");
		            	int id2=s.nextInt();
		            	System.out.println("enter the name to update");
		            	String h1=s.next();
		            	for(i=1;i< count;i++)
		            	{
		            		if(s1[i].id==id2)
		            		{
		            			s1[i].name=h1;
		            			System.out.println(s1[i]);
		            		}
		            	}
		            	break;
	            
	            
	            case 6:
	            	for(i=0;i<count;i++)
	            	{
	            		System.out.println(s1[i]);
	            	}
	            	break;
	            
	            
	            }
		 

	}

}
}	
	
	
