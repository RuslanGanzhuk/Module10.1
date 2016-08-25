package goit.module10.body;

public class Cipher {
    private char[] arrayCipher = new char[10];
    private final int keyCipher = 3;
    private String cipherText;

    public String createCipherText(String parentText){

        arrayCipher = parentText.toCharArray();

        for(int i = 0; i < arrayCipher.length; i++){
            arrayCipher[i] += keyCipher;
        }
        String textCipher = String.valueOf(arrayCipher);

        return textCipher;
    }

    public String decipher (String textCipher){

        arrayCipher = textCipher.toCharArray();
        for(int i = 0; i < arrayCipher.length; i++){
            arrayCipher[i] -= keyCipher;
        }
        String decipherText = String.valueOf(arrayCipher);

        return decipherText;
    }
}
