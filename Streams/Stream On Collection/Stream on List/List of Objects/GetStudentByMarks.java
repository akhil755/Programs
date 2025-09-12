
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class GetStudentByMarks{
    public static void main(String[] args){
        List<Student> student = Arrays.asList(new Student(1,80),
        new Student(2,70), new Student(3,80), new Student(4,70), new Student(5,90));
        
        Map<Integer, List<Integer>>grouped = student.stream().collect(Collectors.groupingBy(Student::getMarks, 
            Collectors.mapping(Student::getStdid, Collectors.toList())));
        
        grouped.forEach((marks, id)->
        System.out.println("Student with marks: " +marks+":" +id));
    }
}

class Student{
    int stdid;
    int marks;
    
    public Student(int stdid, int marks){
        this.stdid = stdid;
        this.marks = marks;
    }
    public int getStdid(){
        return stdid;
    }
    public int getMarks(){
        return marks;
    }
}

