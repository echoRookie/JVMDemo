/**
 * @author yangjun6
 * @date 2021-04-27 19:17
 */
public class SimpleHeap {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory()/1024/1024;
        long maxMemory = Runtime.getRuntime().maxMemory()/1024/1024;
        long freeMemory = Runtime.getRuntime().freeMemory()/1024/1024;
        System.out.println("initialMemory: " + initialMemory);
        System.out.println("maxMemory: "+ maxMemory);
        System.out.println("freeMemory: " + freeMemory);
        System.out.println("系统内存：" + initialMemory *64);
    }
}
