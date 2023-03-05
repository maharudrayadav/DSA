package Generics;

public class Main {
    public static void main(String [] args){
        Student rudra=new Student(12,89.56f);
        Student rahul=new Student(13,89.4f);

        if(rudra.marks<rahul.marks){
            System.out.println("Rahul has more marks");
        }
        else {
            System.out.println("Rudra has more marks");
        }
    }
}
