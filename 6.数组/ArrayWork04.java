public class ArrayWork04 {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        double sum = 0;
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + "\t");
            if ((arr[i] % 10 == 8) || arr[i] / 10 == 8) {
                System.out.println("包含8的数字有：" + arr[i]);
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            
        }
        System.out.println("sum = " + (sum / arr.length));
        System.out.println("最大数是：" + max + "，下标是" + maxIndex);

    }
}
