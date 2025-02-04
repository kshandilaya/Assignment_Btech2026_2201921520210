//Concept of this

//“this” in Java is a keyword that refers to the current object instance.

//Driver Class

public class JAN29_2025{

    public static void main(String[] args) {
        //create an objject of thisreference class

        thisReference obj1 = new thisReference();
        thisReference obj2 = new thisReference("Yash",21 ,"Male");
    }

}

class thisReference{
    String name;
    int age;
    String gender;

    thisReference()
    {
        this.name = "default";
        this.age = 0;
        this.gender = "NA";
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);

    }

    thisReference(String name,int age,String gender)
    {
        this.age =age;
        this.name=name;
        this.gender=gender;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }


}