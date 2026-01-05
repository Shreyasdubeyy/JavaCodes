import java.util.Scanner;

public class BmiCalculator{

	public static void main(String[] args) 
	{
		//Fill the code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kg");
		double weight=sc.nextDouble();
		System.out.println("Enter height in cm");
		double height=sc.nextDouble();
		double bmi=calculateBmi(weight,height);
		if(bmi>=25) {
			System.out.printf("Your BMI is %.2f.You are overweight\n",bmi);
			System.out.printf("Reduce %.2f to be fit",(bmi-25));
		}
		else if(bmi<18.5) {
			System.out.printf("Your BMI is %.2f.You are underweight\n",bmi);
			System.out.printf("Gain %.2f to be fit",(18.5-bmi));
		}
		else {
			System.out.printf("Your BMI is %.2f. You are fit and healthy\n",bmi);
		}
		
	}
static double calculateBmi(double weight,double height) {
	double bmi=weight/((height/100)*(height/100));
	return bmi;
}
}
