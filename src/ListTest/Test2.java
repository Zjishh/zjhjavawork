package ListTest;

import java.util.ArrayList;
import java.util.List;

/****************************
 * @project zjhjavawork
 * @package ListTest
 * @className Test2
 * @author Zjiah
 * @date 2023/5/15 21:27
 * @Description:   *
 *******************************/
public class Test2 {
    public static void main(String[] args) {
//dsadsad
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.add(1,"wqe");
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);

    }
}
