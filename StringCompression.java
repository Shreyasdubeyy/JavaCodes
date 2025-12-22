import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);

           char arr[];

        //size of array
        int size=sc.nextInt();
        arr=new char[size];

         //elements of array
        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }

        Data data=compress(arr);
        System.out.println("The compressed array length is:" + data.size +" \nand the array is: \n");
       for(int i=0;i<data.size;i++){
        System.out.print(data.chars[i]+" ");
       }



    }

        //Extreme Brute Force Solution
        static public Data compress(char[] chars) {
        int size=0;
        String dup[]=new String[chars.length];
        for(int i=0;i<chars.length;i++){
            int count=1;
            int j=i+1;
            while( j<chars.length && chars[j]==chars[i] ){
                count++;
                j++;
            }
            dup[i]=chars[i]+"";
            size++;

            if(count>1){
                if(count>9){
                    
                    int newI=i+1;
                    // while(tempCount>0){
                    // int rem=tempCount%10;
                    // dup[k++]=String.valueOf(rem);
                    // size++;
                    // tempCount=tempCount/10;
                    // }

                    String countArray[]=Integer.toString(count).split("");
                    for(int k=0;k<countArray.length;k++){
                        dup[newI++]=countArray[k];
                        size++;
                    }

                }
                else{
            dup[i+1]=String.valueOf(count);
            size++;
                }
            }

            i=i+count-1;
        }
    int k=0;
        for(String e:dup){
            if(e!=null){
                chars[k++]=e.charAt(0);
            }
        }
        return new Data(chars,size);
            
        
    }
}

class Data{
    char chars[];
    int size;

    Data(int size){
        chars=new char[size];
    }

    Data(char chars[],int size){
        this.chars=chars;
        this.size=size;
    }
}



