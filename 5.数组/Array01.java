public class Array01 {

    public static void main(String[] args) {
        /*
         * ���ǵ����طֱ��� 3kg,5kg,1kg,3.4kg,2kg,50kg ��
         * ��������ֻ�����������Ƕ���?ƽ�������Ƕ���?
         */
        double[] chooks = {3, 5, 1, 3.4, 2, 50};
        double totalWeight = 0;
        for(int i = 0; i < chooks.length; i++) {
            totalWeight += chooks[i];
        }
        System.out.println(chooks.length + "ֻ����ƽ��������" + (totalWeight / chooks.length) + "kg");
    }
}