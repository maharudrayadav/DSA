package Generics;



import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String [] args){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        Consumer<Integer> fun=(item) ->System.out.println(item+2);
        arr.forEach(fun);


       // Operation Sum =(a, b) ->a+b;
    }
}
interface operation{
    int operation(int a,int b);
}