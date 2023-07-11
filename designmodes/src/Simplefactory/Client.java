package Simplefactory;

/**
 * @author Chris
 * @create 2021-08-30-17:04
 */
public class Client {
    public static void main(String args[]) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }
}
