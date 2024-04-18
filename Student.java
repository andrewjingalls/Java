/* This is object we want to serialize 
- we implement serializable interface to tell java
we want to be able to write out/read in this object

*****
- Any static variables are not serialized
- Any variables with "transient" modifier are not serialized
- Any Object member variables must also be Serializable
- If parent is serializable, child inherits that
- child can be seriablizable without parent being serializable as long 
as parent has default constructor with no arguments
*/

import java.io.*;
public class Student implements java.io.Serializable{
    public String name;
    public int year;

    public Student(){
        name = null;
        year = 1;
    }

    public Student (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return name + " | Year: " + year;
    }
}
