import java.util.*;
public class ReplicatingElement
{
	public String getDuplicateElement()
    {
        // Fill the code
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			System.out.println("Enter the array elements");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter the position of the element to be replicated");
			int p=sc.nextInt();
			
			int rep[]=new int[size+1];
			int j=0;
			for(int i=0;i<=size;i++) {
				if(i==size) {
					rep[i]=rep[p];
					continue;
				}
				rep[i]=arr[j++];
			}
			
			String result="";
			result=("The array elements are ");
			for(int e:rep) {
				result+=(e+" ");
			}
			return result;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				return("Array index is out of range");
			}
			catch(InputMismatchException e) {
				return("Input was not in the correct format");
			}
			catch(NegativeArraySizeException e) {
				return("Array size should be positive");
			}
        
    }
	
	public static void main(String[] args)
    {
        // Fill the code
		ReplicatingElement ui=new ReplicatingElement();
		String result=ui.getDuplicateElement();
		System.out.println(result);
    }
}