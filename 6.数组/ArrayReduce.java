import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        do {
            int[] temp = new int[arr.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            count++;
            System.out.println("�Ѽ���" + count + "�Σ��Ƿ��ڼ�������y/n");
            char operation = myScanner.next().charAt(0);
            if (operation == 'n') {
                break;
            } else if(arr.length == 1) {
                System.out.println("ֻʣ�����һ��Ԫ�أ�������������");
            }
        } while (arr.length > 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
