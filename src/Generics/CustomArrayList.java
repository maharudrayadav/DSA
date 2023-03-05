package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int  [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    private boolean isfull() {
        return size==data.length;
    }

    private void resize() {

        int[] temp=new int [data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    public String toString(){
        return "CustomArrayList{"+
                "data="+ Arrays.toString(data)+
                ", size=" + size +
                '}';
    }
    public static  void main(String [] args){
        CustomArrayList list=new CustomArrayList();
        list.add(10);
        list.add(45);
        System.out.println(list);
        ArrayList <String> list2=new ArrayList<>();
        list2.add("rudra");
        System.out.println(list2);
    }
}

