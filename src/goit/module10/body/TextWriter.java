package goit.module10.body;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static goit.module10.body.TextReader.TEXT;

public class TextWriter {

   private BufferedWriter fileWriter;

    public void writerText(Object a){

        try{
            fileWriter = new BufferedWriter(new FileWriter(TEXT,true));
            fileWriter.write(a.toString() + " ");
            fileWriter.flush();
        }catch(IOException e){
            System.out.println("Error file not found!!!");
        }
    }

}
