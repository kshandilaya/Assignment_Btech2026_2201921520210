// Inheretrence in OOPS

//Inheretence allows a class to inherit properties and methods from another class.



public class JAN31_2025 {

    public static void main(String[] args) {
        // we can access method sum of class A via obj of class B

        B obj = new B();
        //calling the sum method via object of class B
        System.out.println(obj.sum(43,21));
        //calling the diff method 
        System.out.println(obj.diff(54,21));

        //Class B inherit the method sum of class A
    
    }

    
}

class A{
    public int sum(int a,int b)
    {
        return a+b;
    }
}

class B extends A{
    public int diff(int a,int b)
    {
        return a-b;
    }
}