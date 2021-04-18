/**
 * @author yangjun6
 * @date 2021-04-18 21:32
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        // 获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);
        // 获取引导类类加载器
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);
        // 获取用户自定义类加载器
        ClassLoader userClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(userClassLoader);
    }
}
