public class MethodParameter02 {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Person aa = new Person();
        aa.test100(arr);
        System.out.println(arr[0]);  // ����һ�����飬�ڷ������޸ĸ����飬����ԭ���������仯

        Person1 p = new Person1();
        p.name = "jack";
        p.age = 10;
        aa.test200(p);
        //������, ��� test200 ִ�е��� p = null ,����Ľ���� 10
        //������, ��� test200 ִ�е��� p = new Person();..., ����������� 10
        //������, ��� test200 ִ�е��� p.age = 10000;..., ����������� 10000
        System.out.println("main �� p.age=" + p.age);//10000
        
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
        //p.age = 10000; //�޸Ķ�������
        p = new Person1();
        p.name = "TOM";
        p.age = 100;
        //p = null;
    }

}


