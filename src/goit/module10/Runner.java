package goit.module10;

import goit.module10.body.*;
import java.io.IOException;

public class Runner {
    public static void main(String[] args)throws IOException {

        Cipher cipher = new Cipher();
        TextReader textReader = new TextReader();
        TextWriter textWriter = new TextWriter();
        DataStorage data = new DataStorage(MyText.getText(),cipher.createCipherText(MyText.getText()),cipher.decipher(cipher.createCipherText(MyText.getText())));
        textWriter.writerText(data);
        textReader.readerText();
        /*data.createTempFile(MyText.getText());
        data.createTempFile(cipher.createCipherText(MyText.getText()));
        data.createTempFile(cipher.decipher(cipher.createCipherText(MyText.getText())));
        data.printTempStorage();*/

       /* textWriter.writerText("Perent text - " + MyText.getText());
        textWriter.writerText("\nCipher text - " + cipher.createCipherText(MyText.getText()));
        textWriter.writerText("\nDecipher text - " + cipher.decipher(cipher.createCipherText(MyText.getText())));
        textReader.readerText();*/
    }


}