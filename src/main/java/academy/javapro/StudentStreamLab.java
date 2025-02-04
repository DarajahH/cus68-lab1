

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamLab {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior")
        );

        // TODO - Filtering: Students with GPA > 3.0
        	List<Student> Hroll = students.stream()
        			.filter(n -> n.getGpa()> 3)
        			.collect(Collectors.toList());        
        	
        	System.out.println("Honor Roll: " + Hroll);
        	
       	// TODO - Mapping: Extract names of students with GPA > 3.0
        	List<String> NamesOnly = Hroll.stream()
        	.map(n -> n.getName())
        	.collect(Collectors.toList());
        	
        	System.out.println("Names Only: " + NamesOnly);
        	
        // TODO - Reducing: Calculate the average GPA of all students
        	double AvGpa = students.stream()
        	
        			.mapToDouble(Student::getGpa) 
        			.average()
        			.orElse(0.0);
        			
        			
        	System.out.println("Average Gpa: " + AvGpa);
        				
        // TODO Collecting: Collect all "Junior" students into a list
        	
        	List<String> Juniors = students.stream()
        			.filter(n -> n.getCollegeYear().equalsIgnoreCase("Junior"))
        			.map(Student::getName)
        			.collect(Collectors.toList());
        	
        	System.out.println("All Junior Students: " + Juniors);
    }
}
