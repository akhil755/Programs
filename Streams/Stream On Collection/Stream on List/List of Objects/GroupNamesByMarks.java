import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNamesByMarks{
    public static void main(String[] args){
        List<Student> student = List.of(new Student("Akhil",99),
        new Student("Nikhil", 100),
        new Student("Venkatesh", 100),
        new Student("Chandu",99));
        
        Map<Integer,List<String>> namesGroupedByMarks= student.stream().collect(Collectors.groupingBy(Student::marks, Collectors.mapping(Student::name, Collectors.toList())));
        
        namesGroupedByMarks.forEach((marks,names)->System.out.println("names Grouped by marks:"+marks+":"+names));
    }
    
    
}

public record Student(String name, int marks){
    
}