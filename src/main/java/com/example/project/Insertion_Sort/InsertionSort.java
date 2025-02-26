package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int val;
        int c=0;
        for (int i = 0; i < elements.length; i++) {
            val= elements[i];
            for(int j= i-1; j >= -1; j--){
                c++;
                if(j!=-1 && elements[j]>val){
                    elements[j+1]=elements[j];
                }else{
                    elements[j+1]=val;
                    break;
                }
            }
        }
        System.out.println("insert: " + c);
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        int temp;
        int min;
        int c=0;
        for (int i = 0; i < elements.length; i++) {
            temp=elements[i];
            min=i;
            for (int j = i+1; j < elements.length; j++) {
                if(elements[j]<elements[min]){
                    elements[i]=elements[j];
                    min=j;
                }
                c++;
            }
            elements[min]=temp;
        } 
        System.out.println("Selection: " + c);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        String val;
        for (int i = 0; i < words.size(); i++) {
            val= words.get(i);
            for(int j=i-1; j >= -1; j--){
                if(j==-1 || words.get(j).compareTo(val) < 0){
                    words.add(j+1, val);
                    words.remove(i+1);
                    break;
                }
            }
        }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
    }

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

    public static void main(String[] args) {
        int[] e =  new int[] {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        int[] e2 = new int[] {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        int[] e3 = new int[] {77, -5, -4, 100, 12, 6, 89, 13, 0, 54, 3, 86, -20, 14, 40, 19};
        int[] e4 = new int[] {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20};
        int[] e5 = new int[] {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};
        int[] e6 = new int[] {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
        int[] e7 = new int[] {116,182,180,65,111,63,87,198,164,144,31,41,24,52,107,70,156,96,43,184,47,135,177,12,167,46,108,154,151,118,101,29,90,122,113,39,163,34,106,141,176,129,86,185,153,200,150,17,145,4};
        insertionSort(e);
        selectionSort(e);
        insertionSort(e2);
        selectionSort(e2);
        insertionSort(e3);
        selectionSort(e3);
        insertionSort(e4);
        selectionSort(e4);
        insertionSort(e5);
        selectionSort(e5);
        insertionSort(e6);
        selectionSort(e6);
        insertionSort(e7);
        selectionSort(e7);
    }
   
}