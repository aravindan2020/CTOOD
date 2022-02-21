package aggregation1;

public class aggmain {

	public static void main(String[] args) {
		//a2 object only used for association
		Adhar a2=new Adhar(564512348910l);
		Mobilenumber m1=new Mobilenumber(987654321l,9786561111l);
		Person p1=new Person("name1",m1,564512348910l);//adhar-composition
		//m1-aggregation
		System.out.println(m1);
		//association
		boolean x=a2.dob();
	    boolean y=m1.electionid();
		System.out.printf("%s and %s",x,y);
		
		/*
		 * composition:
		 * here adhar class is called inside the person class,so the
		 * parameter passed through person object 
		 * aggregation:
		 * here mobile number class object is created separately and called in the person class
		 * so when person class is null mobile class is still existed 
		 * Association:
		 * here two method are created one in adhar class and another in mobile number class
		 * if we have to display together we need to call with corresponding object in the print statement    
		 */
		 */
	}
}
