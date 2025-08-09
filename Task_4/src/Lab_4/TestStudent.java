package Lab_4;
import java.util.*;
public class TestStudent 
{
	    public static void main(String[] args) 
	    {
	        Student student = new Student();
	        student.setDetails(101, 'A', "John Doe");
	        student.showDetails();

	        System.out.println("Accessing name directly: " + student.name);
	    }
}