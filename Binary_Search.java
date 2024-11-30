import java.util.Arrays;

public class Binary_Search {
    public static int BinarySearch(int numbers[], int keys) {
        int start = 0;
        int end = numbers.length - 1;
        // comparision
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == keys) {
                return mid;
            }
            if (numbers[mid] < keys) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // if keys does not exist we will return -1
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 6, 7 };
        int keys = 7;
        System.out.println("the index is :" + BinarySearch(numbers, keys));
    }
}