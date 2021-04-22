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
    public void test(){
        int a = 0;
        {
            int b = 1;
            b = a + 1;
        }
        // 变量c使用已经被销毁的b的位置，所以局部变量表的长度还是3
        int c = a + 1;
    }
}
