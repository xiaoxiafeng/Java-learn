public class Recursion01 {
    
    public static void main(String[] args) {

        T t = new T();
        t.test(5);
        int a = t.factorial(3);
        System.out.println(a);
        
    }
}

class T {
    public void test(int num) {
        if (num > 0) {
            test(num - 1);
        }
        System.out.println("num = " + num);
    }
    public int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }
}