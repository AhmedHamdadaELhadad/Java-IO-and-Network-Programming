import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

//creat FileReader TO read Sourse code and return it  with Charcater Stream
    public static void main(String[] args) {
// Specify the file to be read
        String fileName = "FileReaderDemo.java";

        // Try-with-resources statement to ensure the FileReader is closed automatically
        try (FileReader fileReader = new FileReader(fileName)) {
            int c;
            // Read and print the file character by character
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c); // Cast to char to print the actual character
            }
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + fileName);
        }

    }}
