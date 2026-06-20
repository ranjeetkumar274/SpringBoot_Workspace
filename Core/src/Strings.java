import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = "Hello Ashu";
        String str1 = "Hello Ashu1";

        String str2 = new String("Hello Ashu2");

        char[] arr = {'H','e','l','l','o'};
        String str3 = new String(arr);

        System.out.println(str+" "+str1+" "+str2+" "+str3);


    }
}
