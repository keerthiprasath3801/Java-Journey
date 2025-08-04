package programs.patterns;

public class CharacterPyramid {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){

            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch--;
            for(int j=0;j<i;j++){
                System.out.print(--ch+" ");

            }
            System.out.println();
        }
    }
}
