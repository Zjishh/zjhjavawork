package jiekou;

/****************************
 * @project zjhjavawork
 * @package jiekou
 * @className Frog
 * @author Zjiah
 * @date 2023/3/21 9:41
 * @Description:   *
 ****************************/
public class Frog extends Animal implements Swin{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃田鸡");
    }

    @Override
    public void swin() {
        System.out.println("青蛙在游泳");
    }
}
