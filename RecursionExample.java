public class RecursionExample {
static int count=0,number=0;
    public static void main(String[] args) {
        // printName("Shreyas");
        // printNumbers(1,5);
        // printNumbersBackwards(5);
    }


    static void print(){
         if(count==4){
            return;
        }
        System.out.println(count++);
        print();
       
    }


    static void printName(String name){
       if(count==5)return;
       count++;
       System.out.println("Hi my name is:"+name);
       printName(name);
    }


    static void printNumbers(int start,int n){
        if(start>n)return;
        System.out.println(start);
        printNumbers(start+1,n);
    }

    static void printNumbersBackwards(int end){
        if(end<1)return;
        System.out.println(end);
        printNumbersBackwards(end-1);
    }
}