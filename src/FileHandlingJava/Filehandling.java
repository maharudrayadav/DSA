package FileHandlingJava;

import java.io.FileOutputStream;

public class Filehandling {
    public static void main(String[] args) {
        try{
            FileOutputStream f1=new FileOutputStream("Switch.java" );
            String s="Java is Technology";
            byte b[]=s.getBytes();
            f1.write(b);
            f1.close();
            System.out.println("successfully write");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
