public class Method01 {
    
    public static void main(String[] args) {
        //����ʹ��
        //1. ����д�ú������ȥ����(ʹ��)���������
        //2. �ȴ������� ,Ȼ����÷�������
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(50);
        p1.cal02(10);
        // p1.getSum(25, 35);
        //���� getSum ������ͬʱ num1=10, num2=20
        //�� ���� getSum ���ص�ֵ������ ���� returnRes
        double returnRes = p1.getSum(10, 20);
        System.out.println("getSum �������ص�ֵ=" + returnRes);
        
    }
}

class Person {

    int age;
    String name;

    //1. public ��ʾ�����ǹ���
    //2. void �� ��ʾ����û�з���ֵ
    //3. speak() : speak �Ƿ������� () �β��б�
    //4. {} �����壬����д����Ҫִ�еĴ���
    public void speak() {
        System.out.println("�����ǲ���˵�Լ��Ǻ��˵ģ�ֻ�л��˲Ż�˵�Լ��Ǻ���");
    }

    public void cal01() {
        int sum = 0; 
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    //1. (int n) �β��б� ��ʾ��ǰ��һ���β� n, ���Խ����û�����
    public void cal02(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }

    //1. public ��ʾ�����ǹ�����
    //2. double :��ʾ����ִ�к󣬷���һ�� int ֵ
    //3. getSum ������
    //4. (int num1, int num2) �β��б�2 ���βΣ����Խ����û������������
    //5. return res; ��ʾ�� res ��ֵ�� ����
    public double getSum(double n1, double n2) {
        // System.out.println("sum = "  + (n1 + n2));
        double res = n1 + n2;
        return res;
    }

}
