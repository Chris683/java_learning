/**
 * @author Chris
 * @create 2021-06-25-11:31
 */

/** 题目描述
 * 创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
 */
 class CaiPiaoNumber {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*30+1);
            for (int j = 0; j <i ; j++) {
                if (arr[i]==arr[j]){
                    i--;
                    break;
                }

            }
        }
        for (int k = 0; k <arr.length ; k++) {
            System.out.print(arr[k]+" ");

        }
    }
}
