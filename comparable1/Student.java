package comparable1;

public class Student implements Comparable<Student> {
	public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.getName());
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }


}
