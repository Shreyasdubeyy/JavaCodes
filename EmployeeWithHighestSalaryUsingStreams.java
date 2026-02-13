import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeWithHighestSalaryUsingStreams {
    public static void main(String[] args) {
         List<Employee> list=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size");
			int n=sc.nextInt();
			sc.nextLine();
			
			for(int i=0;i<n;i++) {
				
				System.out.println("Enter id");
				int id=sc.nextInt();
				sc.nextLine();

                System.out.println("Enter Name");
				String name=sc.nextLine();

				System.out.println("Enter salary");
				double salary=sc.nextDouble();
				
				list.add(new Employee(id,name,salary));
			}
			
			double max = list.stream().mapToDouble(Employee::getSalary).max().orElse(0);
			
			System.out.println(max!=0?"Max salary is:"+max:"No Max Salary Found");
    }
}
