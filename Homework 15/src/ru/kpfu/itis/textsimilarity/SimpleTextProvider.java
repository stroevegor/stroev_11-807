package ru.kpfu.itis.textsimilarity;

import java.io.File;

public class SimpleTextProvider implements TextProvider {
    private String text;
    private final static int MAX_SYMBOLS_NUM = 100;

    public SimpleTextProvider(String text) {

        this.text = text;
    }

    @Override
    public String getText() {

        return text;
    }

    @Override
    public String toString() {
        String strToReturn;
        if (text.length() <= MAX_SYMBOLS_NUM) {
            strToReturn = text;
        } else {
            strToReturn = text.substring(0, MAX_SYMBOLS_NUM - 1);
        }
        return "SimpleTextProvider{" +
                "text=' " + strToReturn + '\'' +
                '}';
    }
}
