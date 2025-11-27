public class FactorialOfANumberUsingRecursion {
    public static void main(String[] args) {
        factorialInParameterizedWay(5, 1);
        System.out.println("FunctionalWay:"+factorialInFunctionalWay(5));
    }


    static int factorialInParameterizedWay(int i,int n){
        if(i==1){
            System.out.println("ParameterizedWay:"+n);
            return 1;
        }
       return factorialInParameterizedWay(i-1, n*i);
    }

    static int factorialInFunctionalWay(int n){
        if(n<1)return 1;

        return n*factorialInFunctionalWay(n-1);
    }
}
