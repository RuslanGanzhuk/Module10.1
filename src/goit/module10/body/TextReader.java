package goit.module10.body;

import java.io.*;

public class TextReader {
    public static final String TEXT = "D:\\file.txt ";

    //private BufferedReader fileReader = new BufferedReader(TEXT);
    //private FileWriter fileWriter;


   /* public void writerText(String a){

        try{
            fileWriter = new FileWriter(TEXT,true);
            fileWriter.write(a + " ");
            fileWriter.flush();
        }catch(IOException e){
            System.out.println("Error file not found!!!");
        }
    }*/

    public void readerText(){


            try (BufferedReader fileReader = new BufferedReader(new FileReader("D:\\file.txt "))) {

            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        }catch(IOException ex){
            System.out.println("Error file not found");
        }
    }
}
