package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServerScoket {

    public final static void main(String ... ars) throws IOException {

        //creat server socket and blind addres 1568
        ServerSocket serverSocket=new ServerSocket(1568);
       //change statues server to wait any request and exquite
        Socket socket=serverSocket.accept();

       OutputStream outputStream= socket.getOutputStream();

        DataOutputStream outputStream1=new DataOutputStream(outputStream);
        outputStream1.writeUTF("Hello every one");
        outputStream1.close();
        outputStream.close();
        socket.close();
        serverSocket.close();




    }
}
