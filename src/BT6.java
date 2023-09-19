import java.util.Arrays;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int cot = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int hang = sc.nextInt();
        int[][] array = new int[cot][hang];
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print("Nhập hàng thứ " + (i + 1) + ", cột thứ " + (j + 1) + " : ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < cot; i++) {
            int sum = 0;
            for (int j = 0; j < hang; j++) {
                sum = sum + array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < cot; i++) {
            int sum = 0;
            for (int j = 0; j < hang; j++) {
                sum = sum + array[i][j];
            }
//            System.out.println(Arrays.toString(array[i]));
            System.out.println("Tổng của hàng " + (i + 1) + " là: " + sum);
        }
    }
}
