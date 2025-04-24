package Student;

public class postgraduate extends Student {
    public static void main(String[] args) {
        // Single inheritance example

        postgraduate postgraduate = new postgraduate();

        System.out.println(postgraduate instanceof Student);

         // since postgraduate can inherits properties from student it is a  Single inheritance
    }
}