package Strings;

public class SubStringMethods {
    public static void main(String [] args){
        String name = "rudra";
        System.out.println(name.substring(0,2));
        /* In thed substring class two member are passed so it is 0, 2 in this example you are mentioned.
        0 are included & 2 are excluded.By defalut value well you are started 0 to 2 .not are three member in
        the string like that 0,1,2.it is  bydefult value is 2-1 so it is  output print only two sentences only
         */

        System.out.println(name.substring(1));
    }
}
