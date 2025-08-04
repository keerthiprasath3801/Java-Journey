package programs.patterns;

public class PascalAlphabets {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            long val=1;
            for(int j=0;j<=i;j++){
                char ch = (char) ('A' + val - 1);
                System.out.print(ch+" ");
                val=val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
