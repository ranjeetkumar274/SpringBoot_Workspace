import java.util.Scanner;

public class Increments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int k = ++i + j;
        int p = --i + j;

        System.out.println(k+p);
    }
}
