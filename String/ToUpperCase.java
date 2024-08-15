// The program capitalizes the first letter of each word in a string 
// while preserving spaces and the rest of the characters. 

public class ToUpperCase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();  // Initialize StringBuilder without a space
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for (int i = 1; i < str.length(); i++) {  // Start loop from 1 as the first character is handled
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));  // Append the space
                i++;  // Move to the next character after the space
                if (i < str.length()) {  // Check to avoid IndexOutOfBoundsException
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
            } else {
                sb.append(str.charAt(i));  // Append the current character
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi gitesh is my name hahaha!";
        System.out.println(toUpperCase(str));
    }
}
