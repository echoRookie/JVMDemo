/**
 * @author yangjun6
 * @date 2021-04-20 22:18
 */
public class StackErrorTest {
    //演示stackoverflow异常栈溢出
    public static void main(String[] args) {
        System.out.println("test");
        main(args);
    }
}
