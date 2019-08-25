
//super class
public class SeventhWayDemo {
    static int a = m1();

    static {
        System.out.println("Super class static block");

    }

    static int m1() {
        System.out.println(" super static method");
        return 111;
    }
    public static void main(String...ram)
    {
        System.out.println("Main method of super class");
    }
}
