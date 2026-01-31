import java.time.Year;
import java.util.Scanner;
public class CheckIfLeapYear {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        String year = sc.nextLine();
       boolean isLeap = Year.isLeap(Long.parseLong(year));
       System.out.println(isLeap ? "It is a leap year." : "It is not a leap year.");
      
   }
}
