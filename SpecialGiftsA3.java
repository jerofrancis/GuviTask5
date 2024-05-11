package task5;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpecialGiftsA3 {
	public static void main(String[] args) {
		
		// Create a list to store student names
        List<String> studentNames = Arrays.asList("Adam","Abraham", "Britto", "Alexander", "Chitra", "Senthil", "John", "Timothy", "Steffi", "Andrew");
        
        // Filter students whose names start with 'A'
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        
        // Print the students who will receive special gifts
        System.out.println("Students who will receive special gifts:");
        specialGiftStudents.forEach(System.out::println);
}
}
