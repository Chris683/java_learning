import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @题目 1015 德才论 (25分)
 *
 * @描述 把题目读懂。
 * 第一类：H（<100），为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序
 * 第二类：才分不到但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；
 * 第三类：德才分均低于 H，但是德分不低于才分的考生属于“才德兼亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；
 * 第四类：其他达到最低线 L 的考生也按总分排序，但排在第三类考生之后。
 * 第五类就不管他了。
 * 这题难在最后的排序上：当某类考生中有多人总分相同时，按其德分降序排列；若德分也并列，则按准考证号的升序输出。
 *
 * @author ChangSheng
 * @date 2020-02-16
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int N = Reader.nextInt(), L = Reader.nextInt(), H = Reader.nextInt();
        // 存放分数高于L的学生
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            // 当前学生准考证号、德分、才分
            int id = Reader.nextInt(), de = Reader.nextInt(), cai = Reader.nextInt();
            if (de >= L && cai >= L) {
                students.add(new Student(id, de, cai));
            }
        }
        // 排序
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 分别比较类别，总分，德分，准考证
                if (s1.getClasses(H) == s2.getClasses(H)) {
                    if (s1.getSum() == s2.getSum()) {
                        if (s1.de == s2.de) {
                            return s1.id - s2.id;
                        }
                        return s2.de - s1.de;
                    }
                    return s2.getSum() - s1.getSum();
                }
                return s1.getClasses(H) - s2.getClasses(H);
            }
        });
        System.out.println(students.size());
        for (Student s : students) {
            System.out.println(s);
        }
    }

}
/** 快速输入类 */
class Reader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    /** 获取下一段文本 */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

/** 学生类 */
class Student {
    /** 准考证、德分、才分 */
    int id, de, cai;

    public Student(int id, int de, int cai) {
        this.id = id;
        this.de = de;
        this.cai = cai;
    }

    @Override
    public String toString() {
        return id + " " + de + " " + cai;
    }

    /** 获取当前学生类别 */
    public int getClasses(int H) {
        if (de >= H && cai >= H) return 1;
        else if (de >= H && cai < H) return 2;
        else if ((de < H && cai < H) && (de >= cai)) return 3;
        else return 4;
    }

    /** 获取总分 */
    public int getSum() {
        return de+cai;
    }
}
