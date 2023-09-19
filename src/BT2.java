import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng số mảng: ");
        int sum = sc.nextInt();
        int[] array = new int[sum];
        int count = 0;
        while (count < sum) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Giá trị thứ " + (i + 1) + " : ");
                array[i] = sc.nextInt();
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập giá trị cần thêm : ");
        int number = sc.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = sc.nextInt();
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = number;
        for (int i = index + 1; i <= array.length ; i++) {
            newArray[i] = array[i - 1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
