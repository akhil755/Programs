import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmplByDeptWithRecord{
    public static void main(String[] args){
        List<Employee> emp = List.of(
            new Employee("Akhil",100000,"Dev"),
            new Employee("Nikhil",200000,"Business"),
            new Employee("Venky",100000,"DBA"),
            new Employee("Chandu",150000,"Dev")
            );
            
            Map<String, List<String>> groupedEmployeesWithDept = emp.stream().collect(Collectors.groupingBy(Employee::dept, Collectors.mapping(Employee::name, Collectors.toList())));
            groupedEmployeesWithDept.forEach((dept,names)->System.out.println(dept+":"+names));
            
            Map<String, Integer> deptTotalSal = emp.stream().collect(Collectors.groupingBy(Employee::dept, Collectors.summingInt(Employee::sal)));
            System.out.println(deptTotalSal);
            
    }
}

public record Employee(String name, int sal, String dept){
    
}