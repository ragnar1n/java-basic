package week9;

import java.io.File;
import java.util.Scanner;

public class Printer {
    private String fileName;

   public Printer(String fileName){
            this.fileName=fileName;
        }
   public void printLinesWhichContain(String word) throws Exception{
       File f=new File(fileName);
       Scanner reader = new Scanner(f,"UTF-8");

       while (reader.hasNextLine()){
           String line = reader.nextLine();
           if (line.contains(word)){
               System.out.println(line);
           }
       }
   }
}
