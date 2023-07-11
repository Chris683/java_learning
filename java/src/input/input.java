package input;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-01-15:32
 */
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        int age = scanner.nextInt();
//        System.out.println(name);
//        System.out.println(age);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a+b);
        while(scanner.hasNext()){
            Integer a = scanner.nextInt();
            Integer b = scanner.nextInt();
            if(a==0&&b==0){
                return;
            }
            System.out.println(a+b);
        }
    }
}
