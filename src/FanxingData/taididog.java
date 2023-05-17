package FanxingData;

/****************************
 * @project zjhjavawork
 * @package FanxingData
 * @className taididog
 * @author Zjiah
 * @date 2023/5/17 21:24
 * @Description:   *
 ****************************/
public class taididog extends dog{
    @Override
    public void eat() {
        System.out.println(" 一只叫做"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头中 ");
    }
}
