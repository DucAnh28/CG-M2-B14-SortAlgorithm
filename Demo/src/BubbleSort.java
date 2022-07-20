public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        int[] array = {12,4,65,7,89,15};
        bubbleSort(array);
        for (int x:array
             ) {
            System.out.println(x);
        }
    }
}
