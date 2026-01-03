import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

       
        System.out.println("Vowels:"+countVowel(word));
       
    }

    static int countVowel(String word){
        int count=0;

        for(char c:word.toLowerCase().toCharArray()){
            if(checkVowel(c))count++;
            
        }
        return count;
    }

    static boolean checkVowel(char ch){
        // if(!Character.isLetter(ch)){
        //     return false;
        // }
        // if("aeiou".contains(ch+""))return true;

        // return false;

        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';

    }
}
