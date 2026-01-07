// The Whale Fishing Club (WFC) conducted a fishing competition on a big lake. The participants allowed for this competition should be 18 years and older. The participants should catch the fishes and give them to the referee so that he will add the count of the fishes based on their size. Then at the end of the day based on the count, points will be awarded. Help WFC by developing an application to convert the count into points in Java.

// Requirements:
// 1. There are 3 types of fishes based on their size. Determine points based on the following
// Big - 10 points
// Medium - 6 points
// Small - 3 points

// 2. Take input from the user as a single string separating each fields with a colon (:)
//  <participants name>:<participants age>:<big fish>:<medium fish>:<small fish>

// 3. Age should be greater than or equal to 18, else print "<age> is an invalid age" and terminate the application

// 4. If the fish count is less than 0 print "<fish count> is an invalid input" and terminate the application

// Note:

// In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
// Ensure to follow the object-oriented specifications provided in the question description.
// Ensure to provide the names for classes, attributes, and methods as specified in the question description.
// Adhere to the code template, if provided
// Do not use System.exit(0) to terminate the program

// Sample Input/Output 1:

// Enter the details

// Hari:20:5:9:15

// Hari scored 149 points

// Explanation:

// Points calculation

// Big fish = 5*10 = 50

// Medium fish =  9*6 = 54

// Small fish = 15*3 = 45

// Total points = 50 + 54 + 45 = 149



// Sample Input/Output 2:

// Enter the details

// Quil:15:2:7:2

// 15 is an invalid age



// Sample Input/Output 3:

// Enter the details

// Allan:22:-1:2:3

// -1 is an invalid input


import java.util.Scanner;

public class FishingCompetition 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the details");
		String details=sc.nextLine();
		
		String data[]=details.split(":");
		
		String name=data[0];
		int age=Integer.parseInt(data[1]);
		if(age<18) {
			System.out.println(age+" is an invalid age");
			return;
		}
		
		int bigFish=Integer.parseInt(data[2]);
		if(bigFish<0) {
			System.out.println(bigFish+" is an invalid input");
			return;
		}
		
		int medFish=Integer.parseInt(data[3]);
		if(medFish<0) {
			System.out.println(medFish+" is an invalid input");
			return;
		}
		
		int smallFish=Integer.parseInt(data[4]);
		if(smallFish<0) {
			System.out.println(smallFish+" is an invalid input");
			return;
		}
		
		int points=calculatePoints(bigFish,medFish,smallFish);
		
		System.out.println(name+" scored "+points+" points");
		
	}
	
	static int calculatePoints(int big,int med,int small) {
		return (big*10)+(med*6)+(small*3);
	}
}	
