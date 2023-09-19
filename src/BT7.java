import java.util.Arrays;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột: ");
        int hang = sc.nextInt();
        System.out.println("Nhập số hàng: ");
        int cot = sc.nextInt();
        if (cot != hang) {
            System.out.println("Nhập lại cột đúng với hàng.");
            main(args);
        } else {
            int[][] array = new int[cot][hang];
            for (int i = 0; i < cot; i++) {
                for (int j = 0; j < hang; j++) {
                    System.out.print("Nhập hàng thứ " + (i + 1) + ", cột thứ " + (j + 1) + " :");
                    array[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < cot; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
            int sum = 0;
            for (int i = 0; i < cot; i++) {
                sum = sum + array[i][i];
            }
            System.out.println("Độ dài đường chéo thứ nhất là: "+sum);
            int sum2 = 0;
            for (int i = 0; i < cot; i++) {
                sum2 += array[i][cot - 1- i];
            }
            System.out.println("Độ dài đường chéo thứ hai là: "+sum2);
        }
    }
}
