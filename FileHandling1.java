package FileHandling;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        DataInputStream input = new DataInputStream((new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Playground\\src\\FileHandling\\hanzerraa.txt")));

        String s = "";

        int c;
        do {
            c = input.read();
            if (c != -1) {
                s += (char) c;
            }
        } while (c != -1);

        String[] array = s.split(" ");
        int[] num = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            num[i] = Integer.parseInt(array[i]);
        }


        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[i]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }


        System.out.println("Sorted in ascending order:");
        for (int k : num) {
            System.out.print(k + " ");
        }
        System.out.println();


        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[i]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }


        System.out.println("Sorted in descending order:");
        for (int j : num) {
            System.out.print(j + " ");
        }
        System.out.println();

        input.close();
    }
}
