//  CAPEGEMINI ASSIGNMENT FOR STRINGS AND ARRAY

// Aravind's teacher gives him an assignment on the topic "array." He got two arrays as input, and in those he has to add the elements of both arrays and store them in a new array, and then only add the last digits of all elements from the third array and store them in a new variable and check if it is a prime number or not. Help Aravind complete his assignment using Java.

// Requirements:

// If both the array size is not the same, print "Both array size is different" then terminate the program.
// If the size is less than or equal to zero, print "<size> is an invalid array size" then terminate the program.
// If the elements entered in an array have a value less than zero, print "<arrValue> is an invalid input" and then terminate the program.
// Note:

// In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
// Ensure to follow the object-oriented specifications provided in the question description.
// Ensure to provide the names for classes, attributes, and methods as specified in the question description.
// Adhere to the code template, if provided
// Please do not use System.exit(0) to terminate the program.

 

// Sample input/Output1:

// Enter the size of first array

// 4

// Enter the array elements

// 2

// 3

// 4

// 5

// Enter the size of second array

// 4

// Enter the array elements

// 6

// 6

// 6

// 6

// 18 is not a prime number

//  Explanation

//  Array1 = {2,3,4,5}

// Array2 = {6,6,6,6}

// add the integers in the two arrays -> Array1[0] + Array2[0] = Array3[0]

// 2+ 6 = 8

// 3+6=9

// 4+6=10

// 5+6=11

// Array3 = {8,9,10,11}

// In a new variable only add last digits in a Array[3]

// 8+9+0+1=18

// Check 18 for prime number

// Hence 18 is not a prime number

 

// Sample input/output2:

// Enter the size of first array

// 2

// Enter the array elements

// 0

// 23

// Enter the size of second array

// 2

// Enter the array elements

// 23

// 25

// 11 is a prime number

//  Explanation

//  Array1 = {0,23}

// Array2 = {23,25}

// add the integers in the two arrays -> Array1[0] + Array2[0] = Array3[0]

// 0+ 23 = 23

// 23+25=48

// Array3 = {23,48}

// In a new variable only add last digits in a Array[3]

// 3+8=11

// Check 11 for prime number

// Hence 11 is a prime number

 

// Sample input/Output3:

//  Enter the size of first array

// -2

// -2 is an invalid array size

 

// Sample input/Output4:

//  Enter the size of first array

// 3

// Enter the array elements

// 1

// 2

// 3

// Enter the size of second array

// -2

// -2 is an invalid array size

 

// Sample input/Output5:

//  Enter the size of first array

// 2

// Enter the array elements

// -3

// -3 is an invalid input

 

// Sample input/Output6:

//  Enter the size of first array

// 1

// Enter the array elements

// 23

// Enter the size of second array

// 2

// Both array size is different

 


import java.util.Scanner;

public class PrimeNumberGame {
	public static void main(String[]args)
	{
	    // Scanner object to take input from user
	    Scanner sc=new Scanner(System.in);

	    // Asking for size of first array
	    System.out.println("Enter the size of first array");
	    int size1=sc.nextInt();
	    
	    // Validate first array size
	    if(size1<1) {
	    	System.out.println(size1+" is an invalid array size");
	    	return;
	    }

	    // Creating first array
	    int arr1[]=new int [size1];
	    System.out.println("Enter the array elements");
	    
	    // Reading elements for first array
	    for(int i=0;i<size1;i++) {
	    	int input=sc.nextInt();
	    	
	    	// Validate input element
	    	if(input<0) {
	    		System.out.println(input+" is an invalid input");
	    		return;
	    	}
	    	arr1[i]=input;
	    }
	    
	    // Asking for size of second array
	    System.out.println("Enter the size of second array");
	    int size2=sc.nextInt();
	    
	    // Validate second array size
	    if(size2<1) {
	    	System.out.println(size2+" is an invalid array size");
	    	return;
	    }

	    // Check if both arrays have same size
	    if(size1!=size2) {
	    	System.out.println("Both array size is different");
	    	return;
	    }

	    // Creating second array
	    int arr2[]=new int[size2];
	    
	    System.out.println("Enter the array elements");

	    // Reading elements for second array
	    for(int i=0;i<size2;i++) {
	    	int input=sc.nextInt();

	    	// Validate input element
	    	if(input<0) {
	    		System.out.println(input+" is an invalid input");
	    		return;
	    	}
	    	arr2[i]=input;
	    }

	    // Combine both arrays by adding corresponding elements
	    int combine[]=combineArray(arr1,arr2);
	    
	    // Calculate sum of last digits of combined array elements
	    int sumOfLastDigits=calculateSum(combine); 
	    
	    // Check whether the sum is a prime number
	    boolean prime=isPrime(sumOfLastDigits);
	    
	    // Print result based on prime check
	    if(prime) {
	    	System.out.println(sumOfLastDigits+" is a prime number");
	    }
	    else {
	    	System.out.println(sumOfLastDigits+" is not a prime number");
	    }
	}

	// Method to combine two arrays by adding elements at same index
	static int[] combineArray(int arr1[],int arr2[]) {
		int arr3[]=new int[arr1.length];
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		
		return arr3;
	}
	
	// Method to calculate sum of last digits of array elements
	static int calculateSum(int [] arr) {
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			int digit=arr[i]%10; // extract last digit
			sum=sum+digit;
		}
		return sum;
	}

	// Method to check whether a number is prime
	static boolean isPrime(int num) {

		// Special case for 2
		if(num==2) {
			return true;
		}
		
		// Check divisibility up to square root of number
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
			    return false;
		}
		
		return true;
	}
}
