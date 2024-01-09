public class Method02 {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 20, 30, 25, 14, 21, 18, 39, 37, 88};
        int[][] arr2 = {{25, 14, 21, 18, 39, 37, 88},{52,30,15,18,30,},{98,54,87,63,94,25,8},{68,87,26,31,7}};

        MyTools tool = new MyTools();
        tool.printArrays(arr1);
        tool.printArrays(arr2);
    }
}

class MyTools {

    public void printArrays(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }

    public void printArrays(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println();
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
        }
    }
}
