public class ArrayDetail {
    public static void main(String[] args) {
        //1. �����Ƕ����ͬ�������ݵ���ϣ�ʵ�ֶ���Щ���ݵ�ͳһ����
        // int[] arr1 = {1,2,3,"hello"}; // ����: �����ݵ�����: String�޷�ת��Ϊint
        double[] arr2 = {1,6,26,3.2,52.3,30};

        //2. �����е�Ԫ�ؿ������κ��������ͣ������������ͺ��������ͣ����ǲ��ܻ���
        String[] arr3 = {"�й�", "LISI", "wangwu"};

        //3. ���鴴�������û�и�ֵ����Ĭ��ֵ
        //int 0��short 0, byte 0, long 0, 
        //float 0.0,double 0.0��char \u0000��
        //boolean false��String null
        short[] arr4 = new short[3];
        System.out.println("===����4===");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //6. �����±������ָ����Χ��ʹ�ã����򱨣��±�Խ���쳣������
        //��������±�/���� ��С 0 ��� ���鳤��-1(4)
        int [] arr5 = new int[5];
        // System.out.println(arr5[5]);//����Խ��
    }
}
