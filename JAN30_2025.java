//Method overloading in Java is also known as Compile-time Polymorphism

public class JAN30_2025 {
   
    public static void main(String[] args) {
         //calling method 1
         System.out.println(conceptOfMethodOverloading.sum(2,3));
         //overloading the method 1
         System.out.println(conceptOfMethodOverloading.sum(1,5,2));
         
         //calling method 3
         System.out.println(conceptOfMethodOverloading.diff(34,31 ));
         //overloading method 3
         System.out.println(conceptOfMethodOverloading.diff(45,23,21));
    }
    
    

    
}

class conceptOfMethodOverloading{
    //method 1
    static int sum(int a,int b)
    return a+b;
    //method 2
    static int sum(int a,int b,int c)
    return a+b+c;
    //method 3
    static int diff(int a,int b)
    return a-b;
    //method 4
    static int diff(int a,int b,int c)
    return (a-b)-c;

}