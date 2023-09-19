import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng : ");
        int cot = sc.nextInt();
        System.out.println("Nhập số cột : ");
        int hang = sc.nextInt();
        int[][] array = new int[cot][hang];
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print("Nhập giá trị cho cột " + (i + 1) + ", hàng " + (j + 1) + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều đã nhập:");
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print(array[i][j] + " ,");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
        int max = 0;
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
