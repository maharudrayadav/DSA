package Exception;

public class Main {
    public static void main(String [] args){
        int a=5;
        int b=0;
        try{
            //divide(a,b);
            String name="rudra";
            if(name.equals("rudra")){
                throw new MyException("name is rudra");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("hello its a final ");
        }
    }
    static int divide(int a,int b){
        if(b == 0){
            throw  new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
