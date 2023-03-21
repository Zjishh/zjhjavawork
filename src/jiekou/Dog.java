package jiekou;

/****************************
 * @project zjhjavawork
 * @package jiekou
 * @className Dog
 * @author Zjiah
 * @date 2023/3/21 9:43
 * @Description:   *
 ****************************/
public class Dog extends Animal implements Swin{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swin() {
        System.out.println("狗再游泳");
    }
}
