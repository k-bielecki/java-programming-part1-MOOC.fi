import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
            }
        }

        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom (int[] table, int startIndex) {
        int indexOfSmallest = 0;
        int smallest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (smallest >= table[i]) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap (int[] array, int index1, int index2) {
        int value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}


