import java.util.HashSet;
import java.util.Set;

public class Pangram_3 {
    public static void main(String[] args) {
        String input = "Fix problem quickly with galvanized jets "; 
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        // Create a set to store encountered letters
        Set<Character> letterSet = new HashSet<>();
        
        // Iterate through the characters in the input string
        for (char c : s.toCharArray()) {
            // Convert the character to lowercase to handle case insensitivity
            char lowercaseChar = Character.toLowerCase(c);
            
            // Check if the character is a letter (a to z)
            if (lowercaseChar >= 'a' && lowercaseChar <= 'z') {
                letterSet.add(lowercaseChar);
            }
        }
        
        // Check if the set contains all 26 letters (a to z)
        return letterSet.size() == 26;
    }
}