package duotai;

/****************************
 * @project zjhjavawork
 * @package duotai
 * @className Student
 * @author Zjiah
 * @date 2023/3/10 20:39
 * @Description:   *
 ****************************/
public class Student extends Person{

    @Override
    public void show() {
        System.out.println("学生的信息为"+getName()+","+getAge());
    }
}
