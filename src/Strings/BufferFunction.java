package Strings;

public class BufferFunction {
    public static void main(String[] args) {
        /*StringBuffer sb = new StringBuffer("hello");
        sb.replace(1,3,"java");
        System.out.println(sb);*/
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append("java");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
    }
}
