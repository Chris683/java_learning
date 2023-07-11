package algorithmquestions;

/**
 * @author Chris
 * @create 2021-09-01-16:42
 */
import java.util.*;
class Main {
    //我可以 空着k个盘，其他n-k个盘每个盘子不空 如果m<n-k那么只有0种
    //

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt(),n=sc.nextInt();
            System.out.println(solve(m,n));
        }
    }
    public static int solve(int m,int n){
        if(n<0) return 0;
        if(n==1||m==1) return 1;
        int res=0;
        for(int i=0;i<=n;i++){  //i代表空盘总数
            res+=notEmpty(m,n-i);
        }
        return res;
    }
    public static int notEmpty(int m,int n){
        if(n<=0) return 0; //还m个要放，但盘子都不给，怎么放？
        if(n==1) return 1;
        if(m<n) return 0;
        if(m==n) return 1;
        else return solve(m-n,n);
    }
}
