import java.util.*;

public class ArrayPractice {

    // 1. Sum & Average of Array
    public static void sumAndAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }

    // 2. Increment Every Element
    public static void incrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        System.out.println("Incremented Array: " + Arrays.toString(arr));
    }

    // 3. Squares and Cubes in New Arrays
    public static void squaresAndCubes(int[] arr) {
        int[] squares = new int[arr.length];
        int[] cubes = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
            cubes[i] = arr[i] * arr[i] * arr[i];
        }

        System.out.println("Squares: " + Arrays.toString(squares));
        System.out.println("Cubes: " + Arrays.toString(cubes));
    }

    // 4. Largest Element and Index
    public static void largestElement(int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("Largest Element = " + max);
        System.out.println("Index = " + index);
    }

    // 5. Search for Element
    public static void searchElement(int[] arr, int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }

    // 6. Count Odd & Even Numbers
    public static void countOddEven(int[] arr) {
        int odd = 0, even = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }

    // 7. Sort Ascending & Descending
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        System.out.print("Descending: [");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // 8. Second Largest & Smallest
    public static void secondLargestSmallest(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Second Smallest = " + arr[1]);
        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }

    // 9. Repeated Numbers with Frequency
    public static void frequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1)
                System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }

    // 10. Merge Two Sorted Arrays
    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                merged[k++] = arr1[i++];
            else
                merged[k++] = arr2[j++];
        }

        while (i < arr1.length)
            merged[k++] = arr1[i++];

        while (j < arr2.length)
            merged[k++] = arr2[j++];

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    // 11. Insert Element at Position
    public static int[] insertElement(int[] arr, int element, int position) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position)
                newArr[i] = element;
            else
                newArr[i] = arr[j++];
        }
        return newArr;
    }

    // 12. Delete Element
    public static int[] deleteElement(int[] arr, int element) {
        return Arrays.stream(arr)
                .filter(x -> x != element)
                .toArray();
    }
}