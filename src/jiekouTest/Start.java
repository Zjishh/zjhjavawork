package jiekouTest;

/****************************
 * @project zjhjavawork
 * @package jiekouTest
 * @className Start
 * @author Zjiah
 * @date 2023/3/21 20:31
 * @Description:   *
 ****************************/
public class Start {
    public static void main(String[] args) {
        Pingpang pingpang = new Pingpang("刘诗雯",22);
        System.out.println(pingpang.getName()+"年龄"+pingpang.getAge());
        pingpang.speak();
        pingpang.study();

    }
}
