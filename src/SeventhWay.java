/*

 When ever we load subclass automatically super class will be loaded
1-> Super class static loading phase execute
2->Super class static initialization phase
3-> Sub class static loading phase execute
4-> sub class static initialization phase
5-> Sub class main Method Execute

by using inheritance load class file */
public class SeventhWay extends  SeventhWayDemo
{
    static int b=m2();

    static{
        System.out.println("Sub class static method");

    }
    static int m2(){
        System.out.println("Static block of sub class");
        return 111;
    }
    public static void main(String arg[])
    {
        System.out.println("Main method of sub Class");
    }
}
