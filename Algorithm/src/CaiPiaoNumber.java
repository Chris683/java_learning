/**
 * @author Chris
 * @create 2021-06-25-11:31
 */

/** 题目描述
 * 创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
 */
 class CaiPiaoNumber {
    public static void main(String[] args) {
        int[] arr = new int[6];                      // 创建数组
        for (int i = 0; i <arr.length ; i++) {       // for循环输入
            arr[i] = (int)(Math.random()*30+1);      // 随机取值1-30
            for (int j = 0; j <i ; j++) {            // for循环，所选元素与前面元素进行对比
                if (arr[i]==arr[j]){                 // 如果和前面元素有相同，i--重新赋值
                    i--;
                    break;
                }

            }
        }
        // 输出数组
        for (int k = 0; k <arr.length ; k++) {
            System.out.print(arr[k]+" ");

        }
    }
}
