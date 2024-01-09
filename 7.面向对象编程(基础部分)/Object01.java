public class Object01 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        cat1.weight = 10;

        Cat cat2 = new Cat();
        cat2.name = "小橙";
        cat2.age = 8;
        cat2.color = "橙色";
        cat2.weight = 20;      
        
        System.out.println("第 1 只猫信息：" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
        System.out.println("第 2 只猫信息：" + cat2.name + " " + cat2.age + " " + cat2.color + " " + cat2.weight);
    }
}

class Cat {
    // 属性 成员变量
    String name;
    int age;
    String color;
    double weight;
}