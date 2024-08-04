public class reverseArray {
    public static void reverse(int num[]){
        int i=0,j=num.length-1;
        while(i<j){
            int temp=num[j];
            num[j]=num[i];
            num[i]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,9};
        reverse(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+",");
        }

    }
}
