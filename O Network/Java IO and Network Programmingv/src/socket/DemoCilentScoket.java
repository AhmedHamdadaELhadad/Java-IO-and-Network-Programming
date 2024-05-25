package socket;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class DemoCilentScoket {
    public  static void main(String ... ars) throws IOException {


        Socket client=new Socket("localhost",1568) ;

        InputStream stream=client.getInputStream();
        DataInputStream inputStream=new DataInputStream(stream);

        String string=inputStream.readUTF();


    System.out.println("The message form Client is "+string);

        inputStream.close();
        stream.close();
        client.close();




    }
}
