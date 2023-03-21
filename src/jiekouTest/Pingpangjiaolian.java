package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className Pingpangjiaolian
 * @author Zjiah
 * @date 2023/3/21 20:18
 * @Description:   *
 ****************************/
public class Pingpangjiaolian extends Jiaolian implements English{
    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓球");
    }

    public Pingpangjiaolian() {
    }

    public Pingpangjiaolian(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练再说英语");
    }
}
