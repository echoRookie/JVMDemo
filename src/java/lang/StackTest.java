package java.lang;

/**
 * @author yangjun6
 * @date 2021-04-20 22:07
 */
public class StackTest {
    public void methodA() {
        int i = 10;
        int k = 20;
        methodB();
    }
    public void methodB() {
        int i = 10;
        int k = 20;
    }
}
