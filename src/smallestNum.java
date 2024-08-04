import java.util.*;

public class smallestNum {
    public static int getsmall(int num1[]){
        int small=Integer.MAX_VALUE;
        for (int i=0;i< num1.length;i++){
            if (num1[i]<small){
                small=num1[i];
            }
        }
return small;
    }
    public static void main(String[] args) {
        int num1[]={4,6,7,3,9};
        System.out.println(getsmall(num1));
    }
}
