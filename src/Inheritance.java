import org.w3c.dom.ls.LSOutput;

class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{                   // arguments are not passed into classes
    public void area(int l, int h){
        System.out.println((1/2)*l*h);

    }
    Shape shape= new Shape();

}

public interface Inheritance {

}
