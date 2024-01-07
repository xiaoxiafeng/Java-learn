public class ArrayDetail {
    public static void main(String[] args) {
        //1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理
        // int[] arr1 = {1,2,3,"hello"}; // 错误: 不兼容的类型: String无法转换为int
        double[] arr2 = {1,6,26,3.2,52.3,30};

        //2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
        String[] arr3 = {"中国", "LISI", "wangwu"};

        //3. 数组创建后，如果没有赋值，有默认值
        //int 0，short 0, byte 0, long 0, 
        //float 0.0,double 0.0，char \u0000，
        //boolean false，String null
        short[] arr4 = new short[3];
        System.out.println("===数组4===");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //6. 数组下标必须在指定范围内使用，否则报：下标越界异常，比如
        //即数组的下标/索引 最小 0 最大 数组长度-1(4)
        int [] arr5 = new int[5];
        // System.out.println(arr5[5]);//数组越界
    }
}
