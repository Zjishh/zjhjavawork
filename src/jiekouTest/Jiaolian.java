package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className Jiaolian
 * @author Zjiah
 * @date 2023/3/21 20:13
 * @Description:   *
 ****************************/
public abstract class Jiaolian extends People{
    public abstract void teach();

    public Jiaolian() {
    }

    public Jiaolian(String name, int age) {
        super(name, age);
    }
}
