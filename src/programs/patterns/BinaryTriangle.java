package programs.patterns;

public class BinaryTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print("");
            }
            for(int j=0;j<i;j++){
                if(j%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
