package goit.module10;

import goit.module10.body.*;

import java.io.IOException;

public class Runner {
    public static void main(String[] args)throws IOException {

        Cipher cipher = new Cipher();
        TextReaderWriter textRW = new TextReaderWriter();

        textRW.writerText("Perent text - " + MyText.getText());
        textRW.writerText("\nCipher text - " + cipher.createCipherText(MyText.getText()));
        textRW.writerText("\nDecipher text - " + cipher.decipher(cipher.createCipherText(MyText.getText())));
        textRW.readerText();
    }
}