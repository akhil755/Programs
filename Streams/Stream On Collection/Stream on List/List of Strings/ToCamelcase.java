import java.util.List;

public class ToCamelcase{
    public static void main(String [] args){
        List<String> names = List.of("akhil","nikhil","chandu");
        names.stream().map(name-> name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()).forEach(System.out::println);
    }
}