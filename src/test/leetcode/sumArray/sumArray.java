package leetcode.sumArray;

public class sumArray {
    public static void main(String[] args) {
        int[] array = new int[]{13, -2, -11, -1, 5, 2, 5};
        //�����������飬��������������֮�ͺ�����ֵ

        /**
         * 1.˫ѭ������ȡ,������
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
        System.out.println("���ֵΪ��" + max);*/


        /**
         * 2. ���õ�ǰ���ֵ��ȫ�����ֵ�ıȽ�������
         *  2.1 ���ǰ�ߵ���������ϵ�ǰ�������ڵ�ǰ��������ΪӦ�ü���
         *  2.2 ��������¼�¼��ǰ���ֵΪ��ǰ����
         */
        //��ǰ���ֵ
        int currentMax = array[0] +array[1];
        //ȫ�����ֵ
        int globalMax = array[0]+array[1];
        for (int i = 2; i < array.length; i++) {
            currentMax =Math.max(currentMax+array[i],array[i]);
            System.out.println("��ǰ���ֵΪ��" + currentMax);
            globalMax =Math.max(currentMax,globalMax);
            System.out.println("��ǰȫ�����ֵΪ��" + globalMax);
        }
        System.out.println("====���ֵΪ��" + globalMax);
    }



}
