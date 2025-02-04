//   STATIC KEYWORD

/*
 Features of static keyword:
 1.Shared memory allocation
 2.Accessible without object intantiation
 3.Assiciated with class,not object

 */


public class FEB01_2025 {
    //static data member
    static int a=10;
    static int b;

    //static block : executed only once , when the class is loaded.
    static{
        System.out.println("Static block initialized");
        b = a*4;
    }

    //static method 

    static void print()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("from main");
        
        System.out.println("Value of a:"+a);
        //static block execute once and gives the value
        System.out.println("Value of b:"+b);

        //static method is called without creation of object
        print();

    }
}
