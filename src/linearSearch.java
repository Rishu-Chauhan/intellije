import java.util.*;
public class linearSearch {
    public static int search(int num[],int key){
        for (int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,5,3};
        int key=6;
        int index=search(num,key);
      if (index==-1){
          System.out.println("NOT FOUND");
      }
      else{
          System.out.println("key is at index:"+index);
      }
    }
}
