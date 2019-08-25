
//By Using Java Development tool And Other tools..
//You can Run your java Program using (javaw) command ..
// when you execute your program using javaw then new file created yes.txt..
import java.io.*;
public class FirstWay {

    static {
        System.out.println("This is Static Block");
    }
    public static void main(String[] r)throws Exception
    {
        System.out.println("This is Main Method");
        FileOutputStream fileOutputStream = new FileOutputStream("Yes.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);
        printStream.println("This text show in yes.txt file");


    }

}
