import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in format dd-MM-yyyy");
		String dateInString=sc.nextLine();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);
		
		
		try {
			LocalDate date=LocalDate.parse(dateInString, dtf);
			System.out.println("String is a valid date:"+date.format(dtf));
			
			
		}catch(DateTimeParseException e) {
			System.out.println("Invalid date");
		}
	}
}
