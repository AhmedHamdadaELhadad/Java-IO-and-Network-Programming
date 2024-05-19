import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutStream {

    public static void main(String[] args)  {


            //Read file and append text witH Byte Stream
        try (FileOutputStream fileOutputStream =new FileOutputStream("O Network/Java IO and Network Programmingv/src/Hello.txt",true);){
            fileOutputStream.write("And Mohamedddddd".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
