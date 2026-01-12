import java.util.Scanner;
public class PasswordValidator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Generate your password");
		String password=sc.nextLine();
		
		if(!isValidPassword(password)) {
			System.out.println(password+" is an invalid password");
			return;
		}
		
		int lowercase=0,uppercase=0,special=0,digit=0;
		
		for(int i=0;i<password.length();i++) {
			if(Character.isDigit(password.charAt(i))) {
				digit++;
			}
			else if(Character.isLowerCase(password.charAt(i))) {
				lowercase++;
			}
			else if(Character.isUpperCase(password.charAt(i))) {
				uppercase++;
			}
			else {
				special++;
			}
		}
		System.out.println("The generated password "+password+" is valid and has "+lowercase+" lowercase alphabet "+uppercase+" uppercase alphabet "+special+" special character "+digit+" digit");

	}

	private static boolean isValidPassword(String password) {
		// TODO Auto-generated method stub
		boolean isValid=false;
		
		if(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[@$*#])[A-Za-z0-9@$*#]{6,12}$")) {
			isValid=true;
		}
		
		return isValid;
	}
}