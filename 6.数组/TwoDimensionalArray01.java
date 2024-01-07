// 多维数组-二维数组
public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        int[][] arr = new int[4][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 1 && j ==2) {
                    arr[i][j] = 1;
                } else if (i == 2 && j == 1) {
                    arr[i][j] = 2;
                } else if (i == 2 && j == 3) {
                    arr[i][j] = 3;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
