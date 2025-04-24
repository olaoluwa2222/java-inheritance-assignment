package Student;

public class fresher extends Undergraduate {
    public static void main(String[] args) {
        // Multi Level Inheritance  example

        fresher fresher = new fresher();

        System.out.println(fresher instanceof Student);

        // Since fresher inherits properties of undergraduate and Student it is a  Multi Level Inheritance

    }
}