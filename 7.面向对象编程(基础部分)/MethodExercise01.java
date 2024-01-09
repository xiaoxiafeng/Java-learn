public class MethodExercise01 {
    
    public static void main(String[] args) {
        AA a = new AA();
        System.out.println("当前数字是偶数吗？ " + a.estimates(9));
        a.estimates(4,4,"#");
        
    }
}

class AA {

    public boolean estimates(int num) {
        return num % 2 == 0;
    }

    public void estimates(int num1, int num2, String str) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
