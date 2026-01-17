import java.util.Scanner;
public class ProfileValidation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your PAN number");
		String pan=sc.nextLine();
		if(!isPanValid(pan)) {
			System.out.println(pan+" is an invalid PAN number");
			return;
		};
		
		
		System.out.println("Enter your E-mail ID");
		String email=sc.nextLine();
		
		if(!isEmailValid(email)) {
			System.out.println("Invalid E-mail ID");
			return;
		}
		System.out.println("Profile of "+name+" updated successfully");
	}
	
	static boolean isPanValid(String pan) {
		boolean isValid=false;
		
		if(pan.matches("[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}")) {
			return true;
		}
		return isValid;
		
	}
	
	static boolean isEmailValid(String email) {
		boolean isValid=false;
		if(email.matches("[a-z0-9]{5,10}(@digitec.com)")) {
			isValid=true;
		}
		
		
		return isValid;
	}
}
