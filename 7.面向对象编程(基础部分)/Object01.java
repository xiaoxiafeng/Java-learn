public class Object01 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "С��";
        cat1.age = 3;
        cat1.color = "��ɫ";
        cat1.weight = 10;

        Cat cat2 = new Cat();
        cat2.name = "С��";
        cat2.age = 8;
        cat2.color = "��ɫ";
        cat2.weight = 20;      
        
        System.out.println("�� 1 ֻè��Ϣ��" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
        System.out.println("�� 2 ֻè��Ϣ��" + cat2.name + " " + cat2.age + " " + cat2.color + " " + cat2.weight);
    }
}

class Cat {
    // ���� ��Ա����
    String name;
    int age;
    String color;
    double weight;
}