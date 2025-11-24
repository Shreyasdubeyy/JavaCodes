import java.util.Scanner;

public class Patterns {
public static void main(String[] args) {
// System.out.println("Enter pattern size:");B
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
// System.out.println("Entered size is: " +n+"\n");

//     System.out.println("Pattern 1");
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }


    // System.out.println("\nPattern 2");
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

// System.out.println("\nPattern 3");
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

pattern4(6);
pattern5(6);

}   

static void pattern4(int size){
    int n=size;
    System.out.println("\nPattern 4");

    for(int i=0;i<n;i++){

        //left space
        for(int l=0;l<n-i-1;l++){
            System.out.print(" ");
        }

        //content
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }

        //right space
        for(int r=0;r<n-i-1;r++){
            System.out.print(" ");
        }

System.out.println();

    }
}


static void pattern5(int size){
    int n=size;
    System.out.println("\nPattern 5");

    for(int i=0;i<n;i++){   
        //left space
        for(int l=0;l<i;l++){
            System.out.print(" ");
        }
 //content
        for(int j=0;j<=2*n-2*i-2;j++){
            System.out.print("*");
        }

        //right space
        for(int r=0;r<i;r++){
            System.out.print(" ");
        }

System.out.println();

    }
}


}
