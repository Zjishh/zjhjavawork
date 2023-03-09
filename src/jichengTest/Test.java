package jichengTest;

/****************************
 * @project zjhjavawork
 * @package jichengTest
 * @className Test
 * @author Zjiah
 * @date 2023/3/9 15:03
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {
        Hashiqi hashiqi = new Hashiqi();
        Shapi shapi = new Shapi();
        Zhonghuatianyuanquan zhonghuatianyuanquan = new Zhonghuatianyuanquan();

        hashiqi.eat();
        hashiqi.chaijia();
        hashiqi.drink();
        hashiqi.lookhome();


        shapi.eat();

        zhonghuatianyuanquan.eat();


    }
}
