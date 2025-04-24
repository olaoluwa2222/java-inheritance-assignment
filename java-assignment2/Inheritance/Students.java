package Student;

public class Student {
    public static void main(String[] args) {
        //Hierarchical Inheritance example 
        Undergraduate undergraduate = new Undergraduate();
        postgraduate postgraduate = new postgraduate();

        System.out.println(undergraduate instanceof Student );
        System.out.println(postgraduate instanceof Student );
       
      // Since both undergraduate and postgraduate can inherits properties from Student it is Hierarchical Inheritance 
    }
}