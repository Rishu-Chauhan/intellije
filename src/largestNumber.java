import java.util.*;
public class largestNumber {
 public static int  largest(int num[]){
     int large=Integer.MIN_VALUE;
     for (int i=0;i<num.length;i++){
         if(num[i]>large){
             large=num[i];
         }
     }
     return large;
 }
    public static void main(String[] args) {
        int num[]={2,5,7,9,5};
        int get=largest(num);
        System.out.println(get);
    }
}
