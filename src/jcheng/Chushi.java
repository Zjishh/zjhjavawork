package jcheng;

/****************************
 * @project zjhjavawork
 * @package jcheng
 * @className Chushi
 * @author Zjiah
 * @date 2023/3/10 19:36
 * @Description:   厨师*
 ****************************/
public class Chushi extends People{
    public Chushi() {
    }

    public Chushi(String id, String name, double gongzi) {
        super(id, name, gongzi);
    }

    @Override
    public void work() {
        System.out.println("在炒菜");
    }
}
