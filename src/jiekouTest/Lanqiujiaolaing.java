package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className Lanqiujiaolaing
 * @author Zjiah
 * @date 2023/3/21 20:21
 * @Description:   *
 ****************************/
public class Lanqiujiaolaing extends Jiaolian{

    public Lanqiujiaolaing() {
    }

    public Lanqiujiaolaing(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球运动员在教打篮球");
    }
}
