
/* import 'MyClass' class from 'names' myPackage */
import myPackage.MyClass;
import static java.lang.System.*;

public class PrintName {
    public static void main(String args[]) {
        // Initializing the String variable
        // with a value
        String name = "GeeksforGeeks";

        // Creating an instance of class MyClass in
        // the package.
        MyClass obj = new MyClass();

        obj.getNames(name);
    }
}