package Algorithmz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MergerSorter {

    void merge(int[] arr, int left, int mid, int right) {
        int sarr1 = mid - left + 1;
        int sarr2 = right - mid;

        int[] L = new int[sarr1];
        int[] R = new int[sarr2];

        for (int i = 0; i < sarr1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < sarr2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < sarr1 && j < sarr2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < sarr1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < sarr2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\Playground\\src\\Algorithmz\\OutputJJ.txt"));
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        reader.close();

        System.out.println("Values in the array before sorting:");
        printArray(num);

        MergerSorter sorter = new MergerSorter();
        sorter.sort(num, 0, num.length - 1);

        System.out.println("\nValues in the array after sorting:");
        printArray(num);
    }
}
