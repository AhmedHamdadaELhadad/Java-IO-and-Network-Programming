import java.io.*;

public class FIStream {

    public static void main(String[] args) throws IOException {
        //read File with Setting of argument
        // Check if the user provided exactly one argument (the filename)
        if (args.length != 1) {
            System.out.println("Usage: ShowFile <filename>");
            return;
        }

        // Handle file reading with a try-with-resources statement
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int input;

            // Read the file and print its contents character by character
            while ((input = fileInputStream.read()) != -1) {
                System.out.print((char) input);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file: " + args[0]);
        } catch (IOException e) {
            System.out.println("Error reading file: " + args[0]);
        }



    }
}
