package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.length+" "+ box.height+" "+ box.width);
        Box box1=new Box(4);
        System.out.println(box1.length+" "+ box1.height+" "+ box1.width);
        BoxWeight weigh=new BoxWeight();
        System.out.println(weigh.length+" "+ weigh.weight);
    }

}
