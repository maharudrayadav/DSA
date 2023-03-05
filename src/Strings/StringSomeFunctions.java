package Strings;

public class StringSomeFunctions {
    public static void main(String[] args) {
        String str1="hello World";
        System.out.println(str1.length());/* length function are
        used in string .lenghth function measure the length of the
        String.String & Array legth function only difference is in the 1)Array length  bracket are not present
        but in the 2)String length() function have bracket has present.*/



        System.out.println(str1.charAt(1));
        /* charAt function it is very useful function. charAt() function are very useful in recursion technique
         */

        System.out.println(str1.indexOf('o'));
        /* indexOf function are not so imporant at Coding but it interviewer question that perceptive it is
        very  imporant. indexOf() function print the value of that posution value
         */
        String str3="bbc";
        String str4="abc";
        System.out.println(str3.compareTo(str4));
        /* compareTo function are compare two string but it is all work depend on Totally ASCII code*/
    }
}
