package java.sumArray;

public class sumArray {
    public static void main(String[] args) {
        int[] array = new int[]{13, -2, -11, -1, 5, 2, 5};
        //连续的子数组，求各个子数组相加之和后的最大值

        /**
         * 1.双循环来获取,暴力法
         */
      /*  int max = array[0] + array[1];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(k + " ");
                    sum = sum + array[k];
                }
                System.out.println();
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("最大值为：" + max);*/


        /**
         * 2. 利用当前最大值和全局最大值的比较来区分
         *  2.1 如果前边的子数组加上当前的数大于当前的数则认为应该加上
         *  2.2 否则就重新记录当前最大值为当前数字
         */
        //当前最大值
        int currentMax = array[0] +array[1];
        //全局最大值
        int globalMax = array[0]+array[1];
        for (int i = 2; i < array.length; i++) {
            currentMax =Math.max(currentMax+array[i],array[i]);
            System.out.println("当前最大值为：" + currentMax);
            globalMax =Math.max(currentMax,globalMax);
            System.out.println("当前全局最大值为：" + globalMax);
        }
        System.out.println("====最大值为：" + globalMax);
    }



}
