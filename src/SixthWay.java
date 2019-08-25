
//in this example we load class file using Class class this cls hold the byte code of SixthWayDemo class.
public class SixthWay {

    public static void main(String arg[])
    {
                Class cls = SixthWayDemo.class;
                System.out.println(cls.getName());
    }
}
