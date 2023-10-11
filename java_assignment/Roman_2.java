import java.util.HashMap;

public class Roman_2 {
    public static void main(String[] args) {
        String roman = "IX"; // Replace with the Roman num we want to convert
        
        int result = romanToInt(roman);
        System.out.println("Roman numeral " + roman + " is equivalent to " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanToInteger.get(s.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }

        return result;
    }
}
