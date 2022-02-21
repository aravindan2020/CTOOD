package compose;

public class Person {
	private Job job;
	 
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        job.setRole("SE");
    }
    public long getSalary() {
        return job.getSalary();
    }
    public String getRole() {
        return job.getRole();
    }

}
