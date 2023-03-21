package jiekou;

/****************************
 * @project zjhjavawork
 * @package jiekou
 * @className tEST
 * @author Zjiah
 * @date 2023/3/21 9:43
 * @Description:   *
 ****************************/
public class tEST {
    public static void main(String[] args) {
        Frog frog = new Frog("小小蛙",2);
        Rabbit rabbit = new Rabbit("小小兔",5);
        Dog dog = new Dog("小小鸡",18);
        System.out.print(frog.getName());
        frog.eat();
        frog.swin();


    }
}
