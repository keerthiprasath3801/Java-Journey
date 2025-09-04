package programs.arrays;

public class MatrixMax {
    public static void main(String[] args) {
        int[][] matrix={
                {11,3,5},
                {9,1,22},
                {2,4,4}
        };
        max(matrix);
        rowmax(matrix);
        maxrow(matrix);
        secondmax(matrix);
    }
    static void max(int[][] matrix){
        int max=matrix[0][0];
        int min=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Maximum : "+ max);
        System.out.println("Minimum : "+min);
    }
    static void rowmax(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            int max=matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }

            }
            System.out.println("Row "+(i+1)+ " Max: "+max );
        }
    }
    static void maxrow(int[][] matrix){
        int max=Integer.MIN_VALUE;
        int rowno=0;
        for(int i=0;i<matrix.length;i++){
            int rowsum=0;
            for(int j=0;j<matrix[i].length;j++){
                rowsum=rowsum+matrix[i][j];
            }
            System.out.println("The sum of the " + (i+i) +" is " + rowsum);
          if(rowsum > max){
                max=rowsum;
                rowno=i+1;
            }
        }
        System.out.println(rowno);
        System.out.println(max);
    }
    static void secondmax(int[][] matrix){
        int max=Integer.MIN_VALUE;int maxsecond=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;int minsecond=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int val=matrix[i][j];
                if(val > max){
                    maxsecond=max;
                    max=val;
                } else if (val > maxsecond && val != max) {
                    maxsecond=val;
                }
                if(val<min){
                    minsecond=min;
                    min=val;
                } else if (val < minsecond && val != min) {
                    minsecond=val;
                }
            }
        }
        System.out.println(maxsecond);
        System.out.println(minsecond);
    }
}

