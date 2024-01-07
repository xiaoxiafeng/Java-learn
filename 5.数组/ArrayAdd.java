// 数组添加/扩容

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if(i < arr.length) {
                temp[i] = arr[i];
            } else {
                temp[i] = (i + 1);
            }
        }
        arr = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3};
        char addArr = 'y';
        while (addArr == 'y') {
            int[] temp1 = new int[arr1.length + 1];
            for (int i = 0; i < temp1.length; i++) {
                if(i < arr1.length) {
                    temp1[i] = arr1[i];
                } else {
                    temp1[i] = (i + 1);
                }
            }
            arr1 = temp1;
            System.out.println("是否继续添加y/n");
            addArr = myScanner.next().charAt(0);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        do {
            int[] temp1 = new int[arr1.length + 1];
            for (int i = 0; i < temp1.length; i++) {
                if(i < arr1.length) {
                    temp1[i] = arr1[i];
                } else {
                    temp1[i] = (i + 1);
                }
            }
            arr1 = temp1;
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }
            System.out.println("是否继续添加y/n");
            char addArr1 = myScanner.next().charAt(0);
            if (addArr1 == 'n') {
                break;
            }
            
        } while (true);

    }
}
