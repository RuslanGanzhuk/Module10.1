package goit.module10;

import goit.module10.body.*;
import java.io.IOException;

public class Runner {
    public static void main(String[] args)throws IOException {

        Cipher cipher = new Cipher();
        TextReader textReader = new TextReader();
        TextWriter textWriter = new TextWriter();

        textWriter.writerText("Perent text - " + MyText.getText());
        textWriter.writerText("\nCipher text - " + cipher.createCipherText(MyText.getText()));
        textWriter.writerText("\nDecipher text - " + cipher.decipher(cipher.createCipherText(MyText.getText())));
        textReader.readerText();
    }
}