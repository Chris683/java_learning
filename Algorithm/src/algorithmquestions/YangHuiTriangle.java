package algorithmquestions;

/**
 * @author Chris
 * @create 2021-06-23-22:16
 */
public class YangHuiTriangle{
    public static void main(String[] args) {
        //1 声明和初始化
        int[][] yangHui = new int[10][];
        // 2 赋值
        for (int i = 0; i <yangHui.length ; i++) {
            yangHui[i] = new int[i+1];
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
            if (i > 1){
                for (int j = 1; j <yangHui[i].length-1 ; j++) {
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }
            }
        }

        // 3 遍历
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j <yangHui[i].length ; j++) {
                System.out.print(yangHui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
