public class ArrayWork02 {
    
    public static void main(String[] args) {
        int num = 1;
        while (num < 10) {
            System.out.println(num);  // 1    3   5   7
            if (num > 5) {
                break;
            }
            num += 2;
        }
    }
}
