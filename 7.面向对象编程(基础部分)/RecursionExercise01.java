// ��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3.,5,8,13..����һ������n���������ֵ�Ƕ�
// ���ӳ���������:��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ��!�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ����
// ������10��ʱ�����ٳ�ʱ(����û��),����ֻ��1�������ˡ�����:��������ٸ�����?

public class RecursionExercise01 {
    
    public static void main(String[] args) {
        int a = 5;
        Test test = new Test();
        int a1 = test.fibonacciNumber(a);
        System.out.println(a1);

        int taot = 1;
        System.out.println(test.tao(taot));
        
    }
}

class Test {
    public int fibonacciNumber(int num) {
        if (num > 0) {
            if (num == 1 || num == 2 ) {
                return 1;
            } else {
                return (fibonacciNumber(num - 1) + fibonacciNumber(num - 2));
            }
        } else {
            System.out.println("Ҫ������� n>=1 ������");
            return -1;
        }
    }

    public int tao(int num) {
        if (num == 10) {
            return 1;
        } else if (num >= 1 || num <= 9){
            return (tao(num + 1) + 1) * 2;
        } else {
            System.out.println("��Χ��1-10֮��");
            return -1;
        }
    }
}