import java.util.Scanner; // импорт сканера
public class Palindrome {
    public static String reverseString(String s)
    {
        String reversedString = "";
        for (int x = s.length() -1; x>=0; x--) {
            reversedString = reversedString + s.charAt(x);
        }
        return reversedString;
    }
    public static boolean isPalindrome(String s)
    {
        if(s.equals(reverseString(s))) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if(isPalindrome(s)) {
                System.out.println(s + " is a palindrome!");
            }
            else {
                System.out.println(s + " is not a palindrome!");
            }
        }
    }
}
