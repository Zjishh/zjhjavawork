package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className Pingpang
 * @author Zjiah
 * @date 2023/3/21 20:15
 * @Description:   *
 ****************************/
public class Pingpang extends Yundongyuan implements English{
    public Pingpang() {
    }

    public Pingpang(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
