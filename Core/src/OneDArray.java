import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
