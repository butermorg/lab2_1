package lab2;

import java.io.*;


public class FileWork {
    String data;
    String filename;
    RandomAccessFile file;
    public String Read() throws IOException {
        filename = "123.txt";
        file = new RandomAccessFile(new File(filename), "r");
        //чтение информации из заданного файла
        data = file.readLine();
        file.close();   
        System.out.println("Информация из файла: " + data);
        return data;
}
    public void found () throws IOException{
    data = data.replaceAll("\\pP", "");
        String[] arrayWords = data.split(" ");
        //поиск по последней и первой букве
            for (int i = 0; i < arrayWords.length-1; i++) {
              if(Character.toLowerCase(arrayWords[i].charAt(arrayWords[i].length()-1)) == Character.toLowerCase(arrayWords[i+1].charAt(0))) {
                  System.out.println(arrayWords[i] + " " + arrayWords[i+1]);
              }
    
}
    }
}