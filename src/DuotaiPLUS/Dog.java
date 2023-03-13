package DuotaiPLUS;

/****************************
 * @project leetcode
 * @package duotai
 * @className Dog
 * @author Zjiah
 * @date 2023/3/13 20:47
 * @Description:   *
 ****************************/
public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"色的狗正在吃"+something);

    }

    public void lookHome() {
        System.out.println("看家");
    }
}
