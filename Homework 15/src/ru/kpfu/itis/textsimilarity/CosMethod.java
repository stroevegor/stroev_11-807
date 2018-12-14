package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;

public class CosMethod implements TextAnalyzer {
    @Override
    public double analyze(TextProvider text1, TextProvider text2) {
        List<String> list1 = tokenizeUniqueNotDelete(text1.getText());
        List<String> list2 = tokenizeUniqueNotDelete(text2.getText());
        List<String> list3 = tokenize(text1.getText() + " " + text2.getText());
        return cosSimilarity(list1, list2, list3);
    }

    private double cosSimilarity(List<String> list1, List<String> list2, List<String> list3) {
        double[] one = TF(list1, list3);
        double[] two = TF(list2, list3);
        double cosCount = 0;
        for (int i = 0; i < one.length; i++) {
            cosCount += one[i] * two[i];
        }
        return cosCount;
    }

    private double[] TF(List<String> pList, List<String> list3) {
        double[] arrcount = new double[list3.size()];
        double count = 0;
        for (int i = 0; i < pList.size() ; i++) {
            if (list3.contains(pList.get(i))){
                arrcount[list3.indexOf(pList.get(i))]++;

            }
        }
        /*
        for (String word : pList) {
            if (list3.contains(word)) {
                arrcount[list3.indexOf(word)]++;
            }
        }
        */
        for (double i : arrcount) {
            count += i * i;
        }
        for (int i = 0; i < arrcount.length; i++) {
            arrcount[i] = arrcount[i] / Math.sqrt(count);
        }
        return arrcount;
    }

    private List<String> tokenizeUniqueNotDelete(String text) {
        text = text.replace(",", " ");
        String[] words = text.split(" ");
        List<String> uniqueWordsNotDelete = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            uniqueWordsNotDelete.add(word);
        }
        return uniqueWordsNotDelete;
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", " ");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }
}

/* private double cosSimilarityList1(List<String> list1) {
        int list1Count = 0;
        for (String word : list1) {
            if (list1.contains(word)) {
                list1Count++;
            }
        }
        return (double) list1Count;
    }*/

   /* private double cosSimilarityList2(List<String> list2) {
        int list2Count = 0;
        for (String word : list2) {
            if (list2.contains(word)) {
                list2Count++;
            }
        }
        return (double) list2Count;
    }*/
