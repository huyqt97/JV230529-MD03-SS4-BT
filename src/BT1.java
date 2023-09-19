import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {6, 7, 5, 3, 2, 9, 6, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số muốn xóa trong mảng: ");
        int number = sc.nextInt();
        int count = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[count] = array[i];
                count++;
            }
        }
        array = Arrays.copyOf(newArray, count);
        System.out.println(Arrays.toString(array));
    }
}
