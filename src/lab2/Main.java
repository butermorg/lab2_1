
package lab2;

import java.io.*;


public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        try{
 FileWork task = new FileWork();
    task.Read();
    task.found();
        }
        catch (FileNotFoundException e) {
System.err.println(e);
}
}
}