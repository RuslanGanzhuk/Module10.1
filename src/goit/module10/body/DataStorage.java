package goit.module10.body;

import java.util.ArrayList;

public class DataStorage {
    ArrayList<String> temporaryStorage = new ArrayList<>();

    public DataStorage(String a, String b, String c){
        createTempFile(a);
        createTempFile(b);
        createTempFile(c);
        printTempStorage();
    }

    public String createTempFile(String someString){
        temporaryStorage.add(someString);
        temporaryStorage.size();

        return someString;
    }

    public void printTempStorage(){
        for (String tS: temporaryStorage) {
            System.out.println(tS);
        }
    }
}
