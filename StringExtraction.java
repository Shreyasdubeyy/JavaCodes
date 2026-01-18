import java.util.Scanner;

public class StringExtraction {
	
	public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       // Fill the code
		
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		
		System.out.println("Enter First Index");
		int index1=sc.nextInt();
		
		System.out.println("Enter Second Index");
		int index2=sc.nextInt();
		
		// UserInterface ui=new UserInterface();
		String result=extractString(str, index1, index2);
		
		System.out.println(result);
		
    }
	
	public static String extractString(String sentence,int number1,int number2)
    {
        // Fill the code
		try {
		String substr="";

		substr=sentence.substring(number1,number2);
		
		String result="The output string is "+substr+". Thanks for using the application.";
		return result;
		
		}
		catch(StringIndexOutOfBoundsException e) {
			return("Invalid index position. Thanks for using the application.");
		}
    }
    

}
