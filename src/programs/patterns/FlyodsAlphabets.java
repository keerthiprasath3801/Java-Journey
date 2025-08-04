package programs.patterns;

public class FlyodsAlphabets {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
