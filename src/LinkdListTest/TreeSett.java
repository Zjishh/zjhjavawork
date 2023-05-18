package LinkdListTest;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

/****************************
 * @project zjhjavawork
 * @package LinkdListTest
 * @className TreeSet
 * @author Zjiah
 * @date 2023/5/18 21:06
 * @Description:   *
 ****************************/
public class TreeSett {
    public static void main(String[] args) {
        TreeSet<String> integers = new TreeSet<>(new Comparator<String>() {
            @Override
            //o1添加的元素  o2红黑树已有的元素
            public int compare(String o1, String o2) {

                int i = o1.length() - o2.length();
                 i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });

        integers.add("v");
        integers.add("w");
        integers.add("f");
        integers.add("a");
        integers.add("ab");
        integers.add("vdvd");
        integers.add("sas");


        System.out.println(integers);


    }

}
