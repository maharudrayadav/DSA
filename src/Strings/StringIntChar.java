package Strings;
import java.util.*;
public class StringIntChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abc";
        int count=0;
        str=str + "xyz";
        for(int i=0;i<str.length();i++){
             count++;
        }
        System.out.println(count);
        System.out.println(str);
    }
}
