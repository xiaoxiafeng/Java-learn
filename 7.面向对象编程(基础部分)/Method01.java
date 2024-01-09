public class Method01 {
    
    public static void main(String[] args) {
        //方法使用
        //1. 方法写好后，如果不去调用(使用)，不会输出
        //2. 先创建对象 ,然后调用方法即可
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(50);
        p1.cal02(10);
        // p1.getSum(25, 35);
        //调用 getSum 方法，同时 num1=10, num2=20
        //把 方法 getSum 返回的值，赋给 变量 returnRes
        double returnRes = p1.getSum(10, 20);
        System.out.println("getSum 方法返回的值=" + returnRes);
        
    }
}

class Person {

    int age;
    String name;

    //1. public 表示方法是公开
    //2. void ： 表示方法没有返回值
    //3. speak() : speak 是方法名， () 形参列表
    //4. {} 方法体，可以写我们要执行的代码
    public void speak() {
        System.out.println("好人是不会说自己是好人的，只有坏人才会说自己是好人");
    }

    public void cal01() {
        int sum = 0; 
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    //1. (int n) 形参列表， 表示当前有一个形参 n, 可以接收用户输入
    public void cal02(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }

    //1. public 表示方法是公开的
    //2. double :表示方法执行后，返回一个 int 值
    //3. getSum 方法名
    //4. (int num1, int num2) 形参列表，2 个形参，可以接收用户传入的两个数
    //5. return res; 表示把 res 的值， 返回
    public double getSum(double n1, double n2) {
        // System.out.println("sum = "  + (n1 + n2));
        double res = n1 + n2;
        return res;
    }

}
