public class MethodParameter01 {
    
    public static void main(String[] args) {
        Swap aa = new Swap();
        int a = 19;
        int b = 90;
        aa.swap(a, b);
        System.out.println("a �� b �����ֵ a = " + a + "\t b = " + b);
    }
}

class Swap {
    public void swap(int a, int b) {
        System.out.println("a �� b ����ǰ��ֵ a = " + a + "\t b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a �� b �������ֵ a = " + a + "\t b = " + b);
    }
}
