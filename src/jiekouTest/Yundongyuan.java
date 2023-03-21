package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className Yundongyuan
 * @author Zjiah
 * @date 2023/3/21 20:11
 * @Description:   *
 ****************************/
public abstract class Yundongyuan extends People{
    public Yundongyuan() {
    }

    public Yundongyuan(String name, int age) {
        super(name, age);
    }

    public abstract void study();


}
