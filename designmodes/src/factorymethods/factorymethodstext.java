package factorymethods;

/**
 * @author Chris
 * @create 2021-08-30-18:24
 */
public class factorymethodstext {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
