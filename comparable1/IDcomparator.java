package comparable1;
import java.util.*;
public class IDcomparator implements Comparator<Student> {
	
    public int compare(Student s1, Student s2) {
        return s1.getId() - s2.getId();
    }

}
