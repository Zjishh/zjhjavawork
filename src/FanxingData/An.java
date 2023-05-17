package FanxingData;

/****************************
 * @project zjhjavawork
 * @package FanxingData
 * @className An
 * @author Zjiah
 * @date 2023/5/17 21:13
 * @Description:   *
 ****************************/
public abstract class An {
    private int age;
    private String name;
    public abstract void eat();


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public An(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public An() {
    }

    public An(String name) {
        this.name = name;
    }

    public An(int age) {
        this.age = age;
    }
}
