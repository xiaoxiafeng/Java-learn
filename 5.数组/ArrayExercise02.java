public class ArrayExercise02 {
    public static void main(String[] args) {
        // �����һ������ int[]�����ֵ {4,-1,9, 30,23}�����õ���Ӧ���±ꡣ
        int[] numbers = {4, -1, 9, 30, 23};
        int max = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = max > numbers[i] ? max : numbers[i];
            maxIndex = max > numbers[i] ? maxIndex : i;
        }
        System.out.println("��������" + max + ",�±���" + maxIndex);
    }
}
