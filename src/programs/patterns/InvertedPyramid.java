package programs.patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=0;i--){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
