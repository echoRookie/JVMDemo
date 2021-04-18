import java.sql.DriverManager;

/**
 * @author yangjun6
 * @date 2021-04-18 22:13
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        // 1
        try {
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 2
        ClassLoader classLoader =  Thread.currentThread().getContextClassLoader();
        // 3
        ClassLoader.getSystemClassLoader().getParent();

    }
}
