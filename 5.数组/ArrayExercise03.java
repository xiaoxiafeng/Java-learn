public class ArrayExercise03 {
    public static void main(String[] args) {
        // 求出一个数组的和和平均值。
        double sum = 0;
        double[] arr = {10, 52, 30, 320.25, 65.2, 1.1, 0.36, 40.3};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("arr的和是" + sum + ",arr的平均数是" + (sum / arr.length));
    }
}
