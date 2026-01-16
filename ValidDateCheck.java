import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ValidDateCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date");
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);   

        try {
            sdf.parse(inputDate);
            System.out.println(inputDate + " is a valid date");
        } catch (Exception e) {
            System.out.println(inputDate + " is not a valid date");
        }
    }
}
