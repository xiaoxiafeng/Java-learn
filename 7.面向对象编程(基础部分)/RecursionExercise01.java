// 请使用递归的方式求出斐波那契数1,1,2,3.,5,8,13..给你一个整数n，求出它的值是多
// 猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，然后再多吃一个。
// 当到第10天时，想再吃时(即还没吃),发现只有1个桃子了。问题:最初共多少个桃子?

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
            System.out.println("要求输入的 n>=1 的整数");
            return -1;
        }
    }

    public int tao(int num) {
        if (num == 10) {
            return 1;
        } else if (num >= 1 || num <= 9){
            return (tao(num + 1) + 1) * 2;
        } else {
            System.out.println("范围在1-10之间");
            return -1;
        }
    }
}