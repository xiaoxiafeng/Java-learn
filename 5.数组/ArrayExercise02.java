public class ArrayExercise02 {
    public static void main(String[] args) {
        // 请求出一个数组 int[]的最大值 {4,-1,9, 30,23}，并得到对应的下标。
        int[] numbers = {4, -1, 9, 30, 23};
        int max = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = max > numbers[i] ? max : numbers[i];
            maxIndex = max > numbers[i] ? maxIndex : i;
        }
        System.out.println("最大的数是" + max + ",下标是" + maxIndex);
    }
}
