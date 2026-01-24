import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageOfEvenNumbersUsingStreams {
    public static void main(String[] args) {
        List<Integer> list=new java.util.ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Average of even numbers is:");
    // int sum=list.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        IntSummaryStatistics stats = list.stream().filter(x->x%2==0).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats.getAverage());
        
    }
}
