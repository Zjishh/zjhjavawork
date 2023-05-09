/****************************
 * @project zjhjavawork
 * @package PACKAGE_NAME
 * @className ArraysTest
 * @author Zjiah
 * @date 2023/5/9 20:57
 * @Description:   *
 ****************************/
public class LambdaTest {
    public static void main(String[] args) {
        sw((String s) -> {
                System.out.println(s);

        });
    }
    public static void sw(jiekou j) {

        j.chouxiangfangfa("555");
    }

}
