package demoserializable;

import java.io.Serializable;

//Serializa is marker interface
public class Myclass implements Serializable {
     String name;
     int age;

     String gmail;
     static  int count=220;
     transient String feacbook ="AHMED@feacebook" ;


    public Myclass(int age, String name, String gmail) {
        this.age = age;
        this.name = name;
        this.gmail = gmail;
    }



    @Override
    public String toString() {
        return "Myclass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", feacbook='" + feacbook + '\'' +
                '}';
    }
}
