package Exception;

public class Exceptionpattern {
    public static void main(String [] args){

        int a[]={1,2,3};
        try{
            System.out.println(a[8]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("BYE");
        }
        finally {
            System.out.println("hello Rahul DADA");
        }
    }
}
