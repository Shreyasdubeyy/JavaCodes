public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        // sumParameterizedWay(4, 0);

        // System.out.println("The sum of the numbers in functional way is : "+sumFunctionalWay(4));
    }



static int sumParameterizedWay(int i,int sum){
if(i<1){
    System.out.println("The sum of the numbers in parameterized way is: "+sum);
    return 0; 
}
  return sumParameterizedWay(i-1, sum+i);
}


static int sumFunctionalWay(int n){
    if(n<1)return 0;
    return n + sumFunctionalWay(n-1);
}



}


