package Exception;

public class NoCatch {
    public static void main(String [] args){
        int a,b;
        a=10;
        b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        finally{
            System.out.println("It is so good");
        }
    }

}
