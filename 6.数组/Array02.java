// 数组动态初始化

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        /*
         * 方式一
         * 数据类型 数组名[] = new 数据类型[大小]
         * 数组名.length 表示数组的大小/长度
         */
        double[] grades = new double[5];

        /*
         * 方式二:先声明数组，再 new 分配空间
         * 数据类型 数组名[];
         * 数组名 = new 数据类型[大小];
         * 数组名.length 表示数组的大小/长度
         */
        double[] scores;
        scores = new double[5];
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素值,scores");
            scores[i] = myScanner.nextDouble();
            System.out.println("请输入第" + (i + 1) + "个元素值,grades");
            grades[i] = myScanner.nextDouble();
        }

        System.out.println("输入的信息如下：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("score = " + scores[i]);
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println("grade = " + grades[i]);
        }


    }
}
