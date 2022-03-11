import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = input.next();
        System.out.println(isPalindrome(word));
    }
    private static boolean isPalindrome(String word){
        int start = 0;
        int end = word.length() - 1;
        while(start <= end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
