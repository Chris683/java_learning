package abstractfactory;

/**
 * @author Chris
 * @create 2021-08-30-18:58
 */
public class abstractfactorytext {
    public static void main(String args[]) {
        //使用抽象层定义

        Button bt;
        TextField tf;
        ComboBox cb;
        SummerSkinFactory factory = new SummerSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }


}

