
class Pen{
    String color;
    String type;
    public void purpose(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color); //"this" is a keyword
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}



public class OOPS{
    public static void main(String[] args) {
             Pen pen1 = new Pen();
             Pen pen2 = new Pen();
             pen1.color = "blue";
             pen1.type = "gel";
             pen2.color = "red";
             pen2.type = "ballpoint";
             pen1.purpose();
             pen1.printColor();

             Student s1 = new Student();
             s1.name = "abc";
             s1.age = 23;
             s1.printInfo();




    }
}