package jcheng;

/****************************
 * @project zjhjavawork
 * @package jcheng
 * @className Test
 * @author Zjiah
 * @date 2023/3/10 19:55
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {
        Jingli jingli = new Jingli("101","张家豪",22.22,666.666);
        System.out.println(jingli.getId()+","+jingli.getName()+","+jingli.getGongzi()+","+jingli.getJiangjin());
        jingli.work();
        jingli.eat();

    }
}
