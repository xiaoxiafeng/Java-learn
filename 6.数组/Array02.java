// ���鶯̬��ʼ��

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        /*
         * ��ʽһ
         * �������� ������[] = new ��������[��С]
         * ������.length ��ʾ����Ĵ�С/����
         */
        double[] grades = new double[5];

        /*
         * ��ʽ��:���������飬�� new ����ռ�
         * �������� ������[];
         * ������ = new ��������[��С];
         * ������.length ��ʾ����Ĵ�С/����
         */
        double[] scores;
        scores = new double[5];
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++) {
            System.out.println("�������" + (i + 1) + "��Ԫ��ֵ,scores");
            scores[i] = myScanner.nextDouble();
            System.out.println("�������" + (i + 1) + "��Ԫ��ֵ,grades");
            grades[i] = myScanner.nextDouble();
        }

        System.out.println("�������Ϣ���£�");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("score = " + scores[i]);
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println("grade = " + grades[i]);
        }


    }
}
