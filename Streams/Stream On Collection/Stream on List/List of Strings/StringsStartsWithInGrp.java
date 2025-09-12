
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StringsStartsWithInGrp {
    
    public static void main(String [] args){
        List<String> names = List.of("Akhil","Nikhil","venkateshwar","narasimha","shiva","Ankitha","Anjali");
        
        Map<Boolean,List<String>> nameswitha = names.stream().collect(Collectors.groupingBy(name->name.startsWith("A")));
        
        System.out.println("names starting with A: "+nameswitha.get(true));
    }
}