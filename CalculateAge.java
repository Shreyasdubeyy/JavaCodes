import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date of Birth in dd-MM-yyyy format");
		String dobInString=sc.nextLine();

		//Validation
		//uuuu instead of yyyy since no era(ad/bc) is specified
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);
		
		try {
			LocalDate dob=LocalDate.parse(dobInString, dtf);
			LocalDate currentDate=LocalDate.now();
			
			long years=ChronoUnit.YEARS.between(dob, currentDate);
			long months=ChronoUnit.MONTHS.between(dob, currentDate)%12;
			
			System.out.println("Age:"+years+" years,"+(months>1?months+" months":months+" month"));
			
			
		}catch(DateTimeParseException e) {
			System.out.println("Enter a valid date");
			return;
		}
	}

}

