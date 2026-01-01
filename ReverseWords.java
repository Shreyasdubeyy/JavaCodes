import java.util.Scanner;

class ReverseWords{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        String s =sc.nextLine();

       

        System.out.println(reverseWords(s));

    }
   
    public static String reverseWords(String s) {

        // split on one-or-more spaces
        String[] split = s.trim().split("\\s+");

        int i = 0, j = split.length - 1;
        while (i < j) {
            String temp = split[i];
            split[i] = split[j];
            split[j] = temp;
            i++;
            j--;
        }

        String result = "";
        for (String e : split) {
            result += e + " ";
        }

        return result.trim();
    }
}

