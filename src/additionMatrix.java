import com.sun.security.jgss.GSSUtil;

public class additionMatrix {
    public static void Add(int a[][],int b[][]){
        int c[][]=new int [3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the sum of matrix is");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int b[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int c[][]=new int [3][3];
        Add(a,b);


    }
}