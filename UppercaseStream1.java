package task5;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseStream1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        
        //map method used to convert to uppercase
        List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());
        
        //print uppercase using stream api
        System.out.println(upperCaseNames);
    }
}

