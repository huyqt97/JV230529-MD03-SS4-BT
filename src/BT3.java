import java.util.Arrays;

public class BT3 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 2, 5, 6, 3};
        int[] array2 = {5, 4, 9, 7, 5};
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[i + array1.length] = array2[i];
        }
        System.out.println("Mảng mới là: " + Arrays.toString(array));
    }
}
