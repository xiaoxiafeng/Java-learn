public class ArrayExercise03 {
    public static void main(String[] args) {
        // ���һ������ĺͺ�ƽ��ֵ��
        double sum = 0;
        double[] arr = {10, 52, 30, 320.25, 65.2, 1.1, 0.36, 40.3};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("arr�ĺ���" + sum + ",arr��ƽ������" + (sum / arr.length));
    }
}
