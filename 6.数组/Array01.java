public class Array01 {

    public static void main(String[] args) {
        /*
         * 它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
         * 请问这六只鸡的总体重是多少?平均体重是多少?
         */
        double[] chooks = {3, 5, 1, 3.4, 2, 50};
        double totalWeight = 0;
        for(int i = 0; i < chooks.length; i++) {
            totalWeight += chooks[i];
        }
        System.out.println(chooks.length + "只鸡的平均体重是" + (totalWeight / chooks.length) + "kg");
    }
}