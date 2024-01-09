public class MethodParameter02 {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Person aa = new Person();
        aa.test100(arr);
        System.out.println(arr[0]);  // 接收一个数组，在方法中修改该数组，看看原来的数组会变化

        Person1 p = new Person1();
        p.name = "jack";
        p.age = 10;
        aa.test200(p);
        //测试题, 如果 test200 执行的是 p = null ,下面的结果是 10
        //测试题, 如果 test200 执行的是 p = new Person();..., 下面输出的是 10
        //测试题, 如果 test200 执行的是 p.age = 10000;..., 下面输出的是 10000
        System.out.println("main 的 p.age=" + p.age);//10000
        
    }
}
class Person1 {
    String name;
    int age;
}


class Person {

    public void test100(int[] arr) {
        arr[0] = 100;
    }

    public void test200(Person1 p) {
        //p.age = 10000; //修改对象属性
        p = new Person1();
        p.name = "TOM";
        p.age = 100;
        //p = null;
    }

}


