// METHOD OVERRIDING
//Method overriding is a key concept in Java that enables Run-time polymorphism.


public class FEB02_2025 {
    public static void main(String[] args) {
        Overriding obj = new Overriding();
        // calls the overriden method from Overriding class
        obj.print();
        //calls the method from initial class Sample
        obj.show();
    }
}

class Sample{
    //initial defition of method 
    public void print(){
        System.out.println("This is the intital method.");
    }
    public void show(){
        System.out.println("This is the method of intital class.");
    }

}
class Overriding extends Sample{
    //method print is overriden
    @Override public void print(){
        System.out.println("This method is overriden");
    }
}

