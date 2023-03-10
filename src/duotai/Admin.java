package duotai;

/****************************
 * @project zjhjavawork
 * @package duotai
 * @className Admin
 * @author Zjiah
 * @date 2023/3/10 20:46
 * @Description:   *
 ****************************/
public class Admin extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息为"+getName()+","+getAge());
    }
}
