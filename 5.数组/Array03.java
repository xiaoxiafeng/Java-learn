// 静态初始化
public class Array03 {
    public static void main(String[] args) {
        /*
         * 数据类型[] 数组名 = {元素值，元素值，...}
         */
        int[] numbers = {23,52,41,20,13,5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number = " + numbers[i]);
        }
    }
}
