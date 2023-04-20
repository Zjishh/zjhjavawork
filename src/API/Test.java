package API;

import java.io.IOException;

/****************************
 * @project zjhjavawork
 * @package API
 * @className Test
 * @author Zjiah
 * @date 2023/4/18 21:01
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {
//        System.out.println(Math.abs(88));
//        System.out.println(Math.abs(-88));
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        try {
            Runtime.getRuntime().exec("shutdown -a");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
