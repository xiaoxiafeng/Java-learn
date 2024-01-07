public class YangHui {
    
    public static void main(String[] args) {
        
        int row = 20;
        int[][] arr = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0 || i == 1) {
                    arr[i][j] = 1;
                } else if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < arr[j].length; j2++) {
                System.out.print(arr[j][j2] + "\t");
            }
            System.out.println();
        }
    }
}
