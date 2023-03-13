package DuotaiPLUS;

/****************************
 * @project leetcode
 * @package duotai
 * @className Person
 * @author Zjiah
 * @date 2023/3/13 20:56
 * @Description:   *
 ****************************/
public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void keep(Dog dog,String something){
        System.out.println(age+"岁的"+name+"养了一条"+dog.getAge()+"岁的"+dog.getColor()+"色的狗");
        dog.eat(something);
    }


    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{age = " + age + ", name = " + name + "}";
    }
}
