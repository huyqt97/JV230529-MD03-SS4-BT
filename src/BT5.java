import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Giá trị thứ " + (i + 1) + " là:");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
