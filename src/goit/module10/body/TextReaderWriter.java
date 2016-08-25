package goit.module10.body;

import java.io.*;

public class TextReaderWriter {
    private FileReader fileReader;
    private FileWriter fileWriter;

    public static final String TEXT = "D:\\file.txt ";

    public void writerText(String a){

        try{
            fileWriter = new FileWriter(TEXT,true);
            fileWriter.write(a + " ");
            fileWriter.flush();
        }catch(IOException e){
            System.out.println("Error file not found!!!");
        }
    }

    public void readerText(){

        try{
            fileReader = new FileReader(TEXT);
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        }catch(IOException ex){
            System.out.println("Error file not found");
        }
    }
}
