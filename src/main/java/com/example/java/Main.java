package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    ArrayList<Integer> integerArray;
    ArrayList<Double> doubleArray;

    ArrayList<String> stringArray;

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    void example(){
        fillArrays();
    }

    <T,U> void printArrays(ArrayList<T> data1, ArrayList<U> data2){

    }

    void fillArrays(){
        for(int i=0;i<10;i++){
            integerArray.add(i);
            doubleArray.add((double)i);
            stringArray.add("text: "+((Integer)i).toString());
        }
    }
}
