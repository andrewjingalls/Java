/* 
SERIALIZATION
- allows to write/read objects through a byte stream
(instead of plain text like with File I/O)
- platform independent, makes it very transportable, useful for web server communication

*/

import java.io.*;
public class Serialization_Lecture {
    public static void main(String[] args){
        Student me = new Student ("Me", 4);
        System.out.println(me);

        try {
            //by convention, .ser extension represents serialized objects
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(me); //pass in object we want to serialize
            out.close();
            System.out.println("Object successfully written out...");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //De-serialization
        Student test = null; //temp val
        try{
            ObjectInputStream in= new ObjectInputStream(new FileInputStream("student.ser"));
            test = (Student) in.readObject();
            in.close();
            System.out.println("Student has been de-serialized");
            System.out.println(test);

        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }



    }
}