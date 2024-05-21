package demoserializable;

import java.io.*;

public class Serializa {

    public static void main(String[] args) {

        serialze();
        deserialze();
    }


    // serialze object in file and automat creat file with name serzal and write uncode line
    static void serialze() {

        try (ObjectOutputStream inputStream =
                     new ObjectOutputStream(new FileOutputStream("serzal.txt"))) {
            Myclass myclass = new Myclass(12, "Ahmed", "aaaa@gmail.com");
            System.out.println(myclass);
            inputStream.writeObject(myclass);

        } catch (Exception e) {
            System.out.println(e);
        }


    }
        static void deserialze(){

            try (ObjectInputStream inputStream =
                         new ObjectInputStream(new FileInputStream("serzal.txt"))){

             Myclass myclass=(Myclass) inputStream.readObject();
                System.out.println(myclass);



            }catch(Exception e){
                System.out.println(e);
            }

    }




}
