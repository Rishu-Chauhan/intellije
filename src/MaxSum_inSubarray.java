public class MaxSum_inSubarray {
    public static void maxSumSub(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
for (int i=0;i<num.length;i++){
    int start=i;
    for (int j=i;j<num.length;j++){
        int end=j;
        currSum=0;
        for (int k=start;k<=end;k++) {
            currSum = currSum + num[k];
        }
            System.out.println(currSum);
           if (maxSum<currSum){
               maxSum=currSum  ;
           }

    }
}
        System.out.println("the max sub array sum ="+maxSum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxSumSub(num);
    }
}
