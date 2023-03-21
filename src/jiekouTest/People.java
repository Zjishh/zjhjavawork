package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className People
 * @author Zjiah
 * @date 2023/3/21 18:21
 * @Description:   *
 ****************************/
public abstract class People {
    private String name;
    private int age;

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

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
