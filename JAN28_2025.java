/*
       Costructor & Constructor Overloading

  A constructor in Java is a special method that is used to initialize objects
 
  The constructor is automatically called at the time of creation of the object of the class .
  It initializes the value of the data members

*/



public class constructorOverloading {
    public static void main(String[] args)
    {
        //here Student() is contructor
        Students s1 = new Students(); 
        //here Student() contructor is overloaded
        Students s2 = new Students(12,"ssf","AI");
        //here Student() contructor is overloaded
        Students s3 = new Students("Shah",10);

        //for each different obj we get diff intialized value as per the called constructor

        //object 1
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.branch);
        //for object 2
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.branch);
        //for object 3
        System.out.println(s3.name);
        System.out.println(s3.rollno);
        System.out.println(s3.branch);
    }
  
    
}
class Students
{
    int rollno;
    String name,branch;
    Students()
    {
        rollno = 21;
        name = "default_name";
        branch = "default_branch";

    }

    // the constructor student is overloaded 

    Students(int rollno,String name,String branch)
    {
        this.rollno = rollno;
        this.name = "Sahil";
        this.branch = "CSE";
        
    }
    Students(String name,int rollno)
    {
        this.rollno = rollno;
        this.name = name;
    }

}

