// 动态初始化-列数不确定
public class TwoDimensionalArray03 {

    public static void main(String[] args) {
        
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < arr[j].length; j2++) {
                System.out.print(arr[j][j2]);
            }
            System.out.println();
        }
    }
}