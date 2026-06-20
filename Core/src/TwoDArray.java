import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter cols: ");
        int c = sc.nextInt();

        int[][] nums = new int[r][c];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}
