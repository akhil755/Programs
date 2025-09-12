import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class GroupEmpByDept{
    public static void main(String []args){
        List<Employee> emp = List.of(new Employee("Akhil", 100000,"Dev"),
        new Employee("Nikhil",200000,"Business"),
        new Employee("venky",100000,"Data Engineer"),
        new Employee("chandu",150000,"Dev"));
        
        Map<String, List<String>> empWithDept = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName, Collectors.toList())));
    
    empWithDept.forEach((dept, names)-> System.out.println("Employees with dept: "+dept+ ":"+names));
    }
    
    
    
}
public class Employee{
    String name;
    int sal;
    String dept;
    
    public Employee(String name, int sal, String dept){
        this.name= name;
        this.sal= sal;
        this.dept= dept;
    }
    
    public String getName(){
        return name;
    }
    public int getSal(){
        return sal;
    }
    public String getDept(){
        return dept;
    }
}