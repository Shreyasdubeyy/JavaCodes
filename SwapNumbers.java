import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int first=sc.nextInt();
		int second=sc.nextInt();
		
		System.out.println("Before swapping\nfirst="+first+",second="+second);
		
		first=first^second;
		second=first^second;
		first=first^second;
		
		System.out.println("After swapping\nfirst="+first+",second="+second);

	}

}
