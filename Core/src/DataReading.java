import java.util.Scanner;

public class DataReading {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a random Number: ");
        int num = sc.nextInt();

        System.out.println("Enter your Name: ");
        String name = sc.next();

        System.out.println("Here is your details: "+name+" "+num);

    }
}
