
import java.util.Arrays;
import java.util.Scanner;

public class ReverseACharArrayWithoutAnyExtraSpaceOrVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        char arr[]=new char[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }

        System.out.println("Given Char array:"+Arrays.toString(arr));
        Solution solution=new Solution();
        solution.reverseString(arr);
    }
}



class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
        System.out.println("After reversing: "+Arrays.toString(s));
    }
}
