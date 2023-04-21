package zhengzebiaodashi;

/****************************
 * @project zjhjavawork
 * @package zhengzebiaodashi
 * @className RegexTest1
 * @author Zjiah
 * @date 2023/4/21 19:59
 * @Description:   *
 ****************************/
public class RegexTest1 {
    public static void main(String[] args) {
        String QQ ="0385802188";

        jiaoyan(QQ);

        System.out.println(QQ.matches("[1-9]\\d{5,19}"));

    }

    private static void jiaoyan(String s) {




    }
}
