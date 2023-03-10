package duotai;

/****************************
 * @project zjhjavawork
 * @package duotai
 * @className Teacher
 * @author Zjiah
 * @date 2023/3/10 20:45
 * @Description:   *
 ****************************/
public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师的信息为"+getName()+","+getAge());
    }
}
