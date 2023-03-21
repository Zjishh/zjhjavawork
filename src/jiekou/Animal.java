package jiekou;

/****************************
 * @project zjhjavawork
 * @package jiekou
 * @className Animal
 * @author Zjiah
 * @date 2023/3/21 9:35
 * @Description:   *
 ****************************/
public abstract class Animal {




    public Animal() {
    }

    private String name ;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //参数,方法体 没有是抽象方法
    //抽象方法所在类必须是抽象类‘
    public abstract void eat();
}
