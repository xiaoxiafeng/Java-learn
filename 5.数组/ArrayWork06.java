public class ArrayWork06 {
    
    public static void main(String[] args) {
        int[] arr = new int[20];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Ã°ÅÝÅÅÐò");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
