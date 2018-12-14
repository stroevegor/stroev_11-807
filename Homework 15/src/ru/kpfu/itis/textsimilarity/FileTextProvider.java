package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
    //private String text;
    private final static int MAX_SYMBOLS_NUM = 100;
    public File input;

    public FileTextProvider(File input){
        this.input = input;
    }
    @Override
    public String getText(){
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(input);
            while(sc.hasNextLine()){
                sb.append(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
        return sb.toString();
    }
    public String toString(){
        String strToReturn;
        String text = getText();
        if(text.length() <= MAX_SYMBOLS_NUM){
            strToReturn = text;
        } else {
            strToReturn = text.substring(0,MAX_SYMBOLS_NUM-1);
        }
        return "SimpleTextProvider{" +
                "text=' " + strToReturn + '\'' +
                '}';
    }
}
