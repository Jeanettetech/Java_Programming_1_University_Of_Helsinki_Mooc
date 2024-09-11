
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int smallest = array[0];
        for (int item : array) {
            if (item < smallest) {
                smallest = item;
            }

        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int min = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                return i;
            }
            ;
        }
        return min;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int min = table[startIndex];

        int index = 0;
        for (int i = startIndex; i < table.length; i++) {

            if (table[i] <= min) {
                min = table[i];
                index = i;
            }

        }
        return index;

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            swap(array, i, indexOfSmallestFrom(array, i));

            System.out.println(Arrays.toString(array));

        }

    }

}
