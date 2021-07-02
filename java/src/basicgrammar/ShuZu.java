package basicgrammar;

/**
 * @author Chris
 * @create 2021-07-01-22:40
 */
// 9 数组
class ShuZu{
    public static void main(String[] args) {
        // 9.1 声明和初始化
        int[] num;                                    //声明
        num = new int[]{1,2,3,4,5,6,7};               //静态初始化
        String[] names = new String[5];               //动态初始化

        //9.2 赋值
        names[0] = "xiaoming";                        //赋值
        names[1] = "nihao";
        names[2] = "wu";
        names[3] = "ni";
        names[4] = "hjk";

        //9.3 数组长度
        System.out.println(names.length);
        System.out.println(num.length);

        //9.4 遍历数组
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        //9.5 二维数组
        int[][] arr = new int[][]{{1,2},{3,4,5},{6,7}};
        int[][] arr1 = new int[3][2];

        //9.6 调用二维数组元素
        System.out.println(arr[0][1]);
        System.out.println(arr1[0][1]);

        //9.7 二维数组的长度
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);


        //9.8  二维数组遍历
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // 9.9二维数组初始值
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);

    }
}
