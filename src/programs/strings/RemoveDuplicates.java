package programs.strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="aaaaa";
        System.out.print(remove(s));;

    }
    static int remove(String s){
        boolean[] seen=new boolean[256];
        StringBuilder remove=new StringBuilder();
        for(int i=0;i < s.length();i++){
            char ch=s.charAt(i);
            if(!seen[ch]){
                remove.append(ch);
                seen[ch]=true;
            }
        }
        String remo= remove.toString();
        return remo.length();
    }
}
