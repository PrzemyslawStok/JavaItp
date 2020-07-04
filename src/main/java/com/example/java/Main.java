package com.example.java;

import java.util.ArrayList;

class A{
}

class B extends A{

}

class C extends B{
    void print(){
        System.out.println("Tutaj pojawia sie nowa funkcja");
    }
}

class D extends C{

}

class E extends D{

}

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

        try {
            printArrays(integerArray, stringArray);
            var data = addArrays(integerArray, integerArray);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<C> array = new ArrayList<>();
        ArrayList<C> array1 = new ArrayList<>();
        fun0(array);
        fun1(array1);
    }

    <T,U> void printArrays(ArrayList<T> data1, ArrayList<U> data2) throws Exception{
        if(data1.size()!=data2.size())
            throw new Exception("Tablice sa roznej dlugosci, prosze podac identycze...");

        for(int i=0;i<data1.size();i++)
            System.out.println(data1.get(i)+" : "+data2.get(i));
    }

    <T> ArrayList<T> addArrays(ArrayList<T> data1, ArrayList<T> data2) throws Exception{
        if(data1.size()!=data2.size())
            throw new Exception("Tablice sa roznej dlugosci, prosze podac identycze...");

        for(int i=0;i<data1.size();i++)
            System.out.println(data1.get(i)+" : "+data2.get(i));

        ArrayList<T> array = new ArrayList<>();
        array.addAll(data1);
        array.addAll(data2);

        return array;
    }

    void fun0(ArrayList<? extends C> data){
        //A->B->C->D->E
        //to zadziala dla C->D->E
        for(int i=0;i<data.size();i++){
            var element = data.get(i);
            element.print();
        }

    }

    void fun1(ArrayList<? super C> data){
        //A->B->C->D->E
        //to zadziala dla A->B->C
    }


    void fillArrays(){
        for(int i=0;i<10;i++){
            integerArray.add(i);
            doubleArray.add((double)i);
            stringArray.add("text: "+((Integer)i).toString());
        }
    }
}
