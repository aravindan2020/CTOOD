package aggregation;

public class main1 {

	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		  
		emp e=new emp(111,"varun",address1);  
		emp e2=new emp(112,"arun",address2);  
		      
		e.display();  
		e2.display();

	}

}
