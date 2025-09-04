package oops.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.length=-1;
        this.height=-1;
        this.width=-1;
    }
    Box(double square){
        this.height=square;
        this.width=square;
        this.length=square;
    }
    Box(double length,double height,double width){
        this.length=length;
        this.width=width;
        this.height=height;

    }
    Box(Box old){
        this.height= old.height;
        this.width= old.length;
        this.length= old.length;
    }
    public void information(){
        System.out.println("Running the box :  ");
    }
}
