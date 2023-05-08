package zhengzebiaodashi;

/****************************
 * @project zjhjavawork
 * @package zhengzebiaodashi
 * @className Intt
 * @author Zjiah
 * @date 2023/5/8 20:19
 * @Description:   *
 ****************************/
public class Intt {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        System.out.println(i1);
        System.out.println(i2);


        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123",4);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);


    }
}
