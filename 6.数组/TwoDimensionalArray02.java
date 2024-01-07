// 二维数组
// 动态初始化
// 类型[][] 数组名=new 类型[大小][大小]
//
// 类型 数组名[][]; 
// 数组名 = new 类型[大小][大小]
public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        
        // int arr[][] = new int[2][3];
        int[][] arr;
        arr = new int[2][3];

        arr[1][1] = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
