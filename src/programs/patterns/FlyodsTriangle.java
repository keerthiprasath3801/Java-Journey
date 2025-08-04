package programs.patterns;

public class FlyodsTriangle {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
