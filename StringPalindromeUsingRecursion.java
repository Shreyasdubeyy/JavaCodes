
import java.util.Scanner;


public class StringPalindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        // String word="racecar";
        System.out.println(palindromeCheck(0, word));
    }

    static boolean palindromeCheck(int i,String word){
        if(i>=word.length()/2){
            return true;
        }
        else if(word.toLowerCase().charAt(i)==word.toLowerCase().charAt(word.length()-i-1)){
            return palindromeCheck(i+1, word);
        }
        else{
        return false;
        }   
    }


}
