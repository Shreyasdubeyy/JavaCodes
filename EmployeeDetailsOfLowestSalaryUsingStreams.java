import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetailsOfLowestSalaryUsingStreams{
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

        Employee emp = list.stream().min(Comparator.comparingDouble(Employee::getSalary)).orElseGet(null);
        System.out.println(emp!=null?"Employee with lowest salary: " + emp.getName() + ", Salary: " + emp.getSalary() : "No employees found.");
    }
}