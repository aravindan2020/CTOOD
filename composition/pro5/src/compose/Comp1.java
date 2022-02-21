package compose;

public class Comp1 {

	public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        String role=person.getRole();
 
        System.out.println("Salary of person :"+salary);
        System.out.println(role);
    }
}
