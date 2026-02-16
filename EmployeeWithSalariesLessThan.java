import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeWithSalariesLessThan {
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

            System.out.println("Enter salary threshold");
            double threshold = sc.nextDouble();
        List<Employee> emps = list.stream().filter(e->e.getSalary()<threshold).collect(Collectors.toList());
        emps.forEach(e->System.out.println(e.getName() + ", Salary: " + e.getSalary()));
    }
}
