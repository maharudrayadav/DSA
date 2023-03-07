package SWICH_STATEMENTS;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        int s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        switch (s){
            case 0:
                System.out.println("it is very good");
                break;
            case 1:
                System.out.println("hello it is good");
                break;
            default:
                System.out.println("it is very good");
        }
    }
}
