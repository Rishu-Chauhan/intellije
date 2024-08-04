public class MatrixBoundary {
    public static void boundary(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
          if(i==0 || j==0 || i==matrix.length-1 || j==matrix[0].length-1){
              System.out.print(matrix[i][j]+" ");
          }
          else {
              System.out.print("  ");
          }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        boundary(matrix);
    }
}
