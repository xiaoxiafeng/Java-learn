// ð������
// ð������Bubble Sorting���Ļ���˼���ǣ�ͨ���Դ��������дӺ���ǰ�����±�ϴ��Ԫ�ؿ�ʼ�������αȽ�����Ԫ�ص�ֵ�������������򽻻���ʹֵ�ϴ��Ԫ���𽥴�ǰ����󲿣�����ˮ���µ�����һ��������ð��
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 68};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
