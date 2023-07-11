package basicgrammar;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-07-01-22:38
 */
// 8 流程控制
public class ProcessControl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("输入成绩：");
        int score = scan.nextInt();

        // if...else
        if (score>90){
            System.out.println("A");
        } else if (90 >= score && score>80){
            System.out.println("B");
        }else if (80 >= score && score>70){
            System.out.println("C");
        }else if (70 >= score && score>60){
            System.out.println("D");
        }else {
            System.out.println("不及格");
        }



        int day = 4;

        //switch
        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }

        // while
        int number = 1;
        while (number<=7){
            System.out.println(number);
            number++;
        }
        // do while
        do{
            System.out.println(number);
            number++;
        }while (number<=7);

        // for
        for (int i = 0; i <7 ; i++) {
            System.out.println(i);
        }
        // continue
        for (int j = 1; j < 10; j++) {
            if(0==j%2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环

            System.out.println(j);
        }
        // break
        for (int j = 1; j < 10; j++) {
            if(0==j%2)
                break; //如果是双数，结束当前循环

            System.out.println(j);
        }

    }
}
