package FanxingData;

/****************************
 * @project zjhjavawork
 * @package FanxingData
 * @className bosicat
 * @author Zjiah
 * @date 2023/5/17 21:21
 * @Description:   *
 ****************************/
public class bosicat extends cat{
    @Override
    public void eat() {
        System.out.println(" 一只叫做"+getName()+"的，"+getAge()+"岁的波斯猫，正在吃小饼中 ");
    }
}
