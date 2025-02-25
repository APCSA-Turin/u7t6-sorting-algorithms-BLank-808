package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int temp;
        int min;
        for (int i = 0; i < elements.length; i++) {
            temp=elements[i];
            min=i;
            for (int j = i+1; j < elements.length; j++) {
                if(elements[j]<elements[min]){
                    elements[i]=elements[j];
                    min=j;
                }
            }
            elements[min]=temp;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        String temp;
        int min;
        for (int i = 0; i < words.size(); i++) {
            temp=words.get(i);
            min=i;
            for (int j = i+1; j < words.size(); j++) {
                if(words.get(i).compareTo(words.get(j)) > 0){
                    words.set(i,words.get(j));
                    min=j;
                }
            }
            words.set(min,temp);
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}