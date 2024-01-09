public class Object03 {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "小明";
        Person p2 = p1;
        System.out.println(p2.name);   // 小明

        Person b;
        b = p1;
        System.out.println(b.name);  // 小明
        b.age = 200;
        b = null;
        System.out.println(p1.age);  // 200
        System.out.println(b.age);   // 异常
    }
}

class Person {
    int age;
    String name;
}