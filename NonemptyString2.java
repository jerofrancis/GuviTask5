package task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonemptyString2 {

	public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        //filter non empty string
        List<String> nonEmptyStrings = listStrings.stream().filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        
        	//print the non empty strings
        System.out.println("List with non-empty strings:");
        System.out.println(nonEmptyStrings);
    }
}
