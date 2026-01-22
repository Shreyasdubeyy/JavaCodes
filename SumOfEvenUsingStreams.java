import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfEvenUsingStreams {
    public static void main(String[] args) {
        		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements");
int n=sc.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<n;i++) {
    list.add(sc.nextInt());
}

System.out.print("Sum of even numbers is:");
    // int sum=list.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
IntSummaryStatistics stats=list.stream().filter(x->x%2==0).collect(Collectors.summarizingInt(x->x.intValue()));
System.out.println(stats.getSum());
    }
}
