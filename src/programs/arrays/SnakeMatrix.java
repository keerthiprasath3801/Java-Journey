package programs.arrays;

public class SnakeMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        snakerow(matrix);
        snakecol(matrix);
    }
    static void snakerow(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
               for(int j=0;j<matrix.length;j++){
                   System.out.print(matrix[i][j] +" ");
               }
            }else {
                for(int j=matrix.length-1;j>=0;j--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
    static void snakecol(int[][] matrix){
        int rows= matrix.length-1;
        int col=matrix[0].length;
        for(int j=0;j<col;j++){
            if(j%2==0){
                for (int i=0;i<=rows;i++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else{
                for (int i=rows;i>=0;i--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
