package DuotaiPLUS;

/****************************
 * @project leetcode
 * @package duotai
 * @className Cat
 * @author Zjiah
 * @date 2023/3/13 20:51
 * @Description:   *
 ****************************/
public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"色的猫咪正在吃"+something);
    }

    public void catchMouse(){
        System.out.println("逮老鼠");
    }

}
