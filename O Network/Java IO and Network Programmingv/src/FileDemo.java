import java.io.File;

public class FileDemo {

    //File Method and How use
    public static void main(String[] args) {


        File file=new File("E:\\JAVA\\I\\O Network\\Java IO and Network Programmingv\\src\\Hello.txt");

/*
        System.out.println("Are Exisit  "+file.exists());
        System.out.println("Are File  "+file.isFile());
        System.out.println("The Name is "+file.getName());
        System.out.println("The Absolte Name is "+file.getAbsolutePath());
        System.out.println("The path  is "+file.getPath());
        System.out.println("Can Writed "+file.canWrite());
        System.out.println("Can Readed "+file.canRead());
        System.out.println((file.isDirectory() ? "":"not " )+ "a Directory");
*/
        findFile();

    }


    //Method find all Folder and sub File

    public static void findFile(){

        String root=".";

        File file=new File(root);
        String []names=file.list();

        if(file.isDirectory()){
        for (String s :names){

            File file1=new File(root+"/"+s);

            if(file1.isDirectory()){
                System.out.println(s+"is a Directory");
            }else
                System.out.println(s+"is a File");
        }}else
            System.out.println("is Not  Directory");

        }








    }





