package Student;

public class Undergraduate extends Student {


    public static void main(String[] args) {
    // Single inheritance  example
 
    Undergraduate undergraduate = new Undergraduate();

    System.out.println(undergraduate instanceof Student );

    // since Undergraduate can inherits properties from student it is a  Single inheritance
    }
   
    
}