package ListTest;

import java.util.Objects;

/****************************
 * @project zjhjavawork
 * @package ListTest
 * @className Student
 * @author Zjiah
 * @date 2023/5/10 15:29
 * @Description:   *
 ****************************/
public class Studentaa {
    private String name;
    private int age;
    private int yuwen;
    private int shuxue;
//999999
    public Studentaa(String name, int age, int yuwen, int shuxue, int yinyu) {
        this.name = name;
        this.age = age;
        this.yuwen = yuwen;
        this.shuxue = shuxue;
        this.yinyu = yinyu;
    }

    public int getSum() {
        return yinyu+yuwen+shuxue;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    public int getYinyu() {
        return yinyu;
    }

    public void setYinyu(int yinyu) {
        this.yinyu = yinyu;
    }

    private int yinyu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentaa studentaa = (Studentaa) o;
        return age == studentaa.age &&
                Objects.equals(name, studentaa.name);
    }


    public Studentaa() {
    }

    public Studentaa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studentaa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yuwen=" + yuwen +
                ", shuxue=" + shuxue +
                ", yinyu=" + yinyu +
                '}';
    }
}
