import java.util.ArrayList;

/**
 * @author yangjun6
 * @date 2021-05-06 22:31
 */
public class GCTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "test";
        while (true){

            list.add(str);
            str = str + "test";
        }
    }
}
