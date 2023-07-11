package writtentest; /**
 * @author Chris
 * @create 2021-09-01-19:57
 */
import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
    static int recur(int[][] arr){
        return 0;
    }
}