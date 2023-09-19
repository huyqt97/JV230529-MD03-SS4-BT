public class BT9 {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 22, 6, 7, 8, 90, 23};
        int max = 0;
        int max2 = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max2 = max;
                max = array[i];
            } else if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        if (max2 != 0) {
            System.out.println("Phần tử lớn thứ hai là: " + max2);
        } else {
            System.out.println("Không có phần tử lớn thứ hai trong mảng.");
        }
    }
}
