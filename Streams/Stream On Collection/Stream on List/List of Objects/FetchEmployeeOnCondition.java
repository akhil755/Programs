import java.util.List;
import java.time.LocalDate;
import java.time.Period;

public class FetchEmployeeOnCondition{
    public static void main(String[] args){
        List<Employee> employees = List.of(
                new Employee("Alice", 30, 60000, LocalDate.of(2015, 3, 10), "IT"),
                new Employee("Bob", 40, 80000, LocalDate.of(2018, 7, 1), "Finance"),
                new Employee("Charlie", 28, 50000, LocalDate.of(2021, 1, 15), "HR"),
                new Employee("Diana", 35, 90000, LocalDate.of(2012, 11, 20), "IT"));
                System.out.println("employees with more than 5 years tenure");
                employees.stream().filter(emp->Period.between(emp.doj(),LocalDate.now()).getYears()>5)
                .forEach(emp->System.out.println(emp.name()+" | Dept: "+emp.department()+" | doj: "+emp.doj()));
    }
}

record Employee(String name,
int age,
double salary,
LocalDate doj,
String department){}