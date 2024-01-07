public class ArrayWork03 {
    
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int[] arr1 = new int[arr.length + 1];
        int num = 23;
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(i != arr1.length - 1) {
                arr1[i] = arr[i];
            } else {
                arr1[i] = num;
                arr = arr1;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
               if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            } 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
