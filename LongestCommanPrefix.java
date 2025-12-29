
import java.util.Scanner;

public class LongestCommanPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
       
 
        String arr[]=new String[size];
        sc.nextLine();

        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine().toLowerCase();
        }

        System.out.println(longestCommonPrefix(arr));


    }
     public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
     return prefix;
    }

}

