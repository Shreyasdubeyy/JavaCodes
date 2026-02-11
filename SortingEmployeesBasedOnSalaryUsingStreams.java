import java.util.*;
import java.util.stream.*;
public class SortingEmployeesBasedOnSalaryUsingStreams {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter employee id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name");
            String name=sc.nextLine();
            System.out.println("Enter employee salary");
            double salary=sc.nextDouble();
            list.add(new Employee(id,name,salary));
        }
        System.out.println();
        System.out.println("Before sorting:");
        list.forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
        System.out.println();
        
      
        
        List<Employee> sortedList = list.stream().sorted(Comparator.comparingDouble(e->e.salary)).collect(Collectors.toList());
        List<Employee> reverseSortedList =list.stream().sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed()).collect(Collectors.toList());

  System.out.println("After sorting Ascending:");
        sortedList.forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
        
        System.out.println();

        System.out.println("After sorting Descending:");
        reverseSortedList.forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
        


    }
}
