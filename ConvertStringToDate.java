import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class ConvertStringToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date in dd-MM-yyyy format");
        String dateInString = sc.nextLine();    

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(dateInString, dtf);
            System.out.println("Valid date format:"+date.format(dtf));
        } catch (Exception e) {
            System.out.println("Invalid date format");
        }
    }
}
