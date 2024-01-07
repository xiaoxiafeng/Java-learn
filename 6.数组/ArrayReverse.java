// 数组反转
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr1.length];
        for (int i = (arr1.length - 1), j = 0; i >= 0; i--,j++) {
            arr2[j] = arr1[i];
        }
        arr1 = arr2;
        System.out.println("=============");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 教程方式
        int temp =0;
        int len = arr1.length;
        for (int i = 0; i < (len / 2); i++) {
            temp = arr1[len - 1 - i];
            arr1[len - 1 -i] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("=============");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
