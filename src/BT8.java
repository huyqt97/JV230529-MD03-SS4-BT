import java.util.Arrays;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dãy: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị thứ " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số muốn tìm xuất hiện: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện là: " + count);


    }
}
