public class RecursionWithBackTrackBasic {
    public static void main(String[] args) {
        // backInc(5);
        // backDec(1, 5);
    }
    //printing without incrementing the parameters

    static void backInc(int n){
        if(n<1)return;
        backInc(n-1);
        System.out.println(n);
    }

    //printing without decrementing the parameters
 static void backDec(int start,int end){
        if(start>end)return;
        backDec(start+1,end);
        System.out.println(start);
    }
}
