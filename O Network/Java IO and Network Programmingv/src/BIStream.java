import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


//Differnt between Byte and Character Stream


public class BIStream {

    public static void main(String[] args) throws IOException {

        bufferReaderChar();
        byteStramIn();
        // can Read String line
        bufferReaderString();
    }


    /*
    * method convert ByteStram to CharecterStream
    * use uncode support all Language
    * */
    public static void bufferReaderChar() throws IOException {
        // inputStreamReader is convert Byte Stream to Buffer
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Q to EXit ");
        char c;

        do {
            //read method to read one by one character even enter array of character
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != 'q');

    }



        /*
         *
         * use not  support all Language
         * */
        public static void byteStramIn() throws IOException {

          InputStream  in= System.in;
            System.out.println("Enter Q to EXit ");
            char c1 ;

            do {
                //read method to read one by one character even enter array of character
                c1= (char) in.read();
                System.out.println(c1);
            }while (c1!='q');

}
    public static void bufferReaderString() throws IOException {
        // inputStreamReader is convert Byte Stream to Buffer
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter exit to EXit ");
        String s;

        do {
            //read method to read one by one character even enter array of character
           s = (String) bufferedReader.readLine();
            System.out.println(s);
        } while (!"exit".equalsIgnoreCase(s));

    }

}
