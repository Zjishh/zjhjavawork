package Settest;

import util.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/****************************
 * @project zjhjavawork
 * @package Settest
 * @className SetT1
 * @author Zjiah
 * @date 2023/5/18 15:16
 * @Description:   *
 ****************************/
public class SetT1 {
    public static void main(String[] args) {
        Set<String> s =new HashSet();
        boolean add = s.add("1大萨达");
        boolean add2 = s.add("2大萨达");
        System.out.println(add);

        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        Student student = new Student("zjh",666);
        Student student2 = new Student("zjh",666);

        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());

    }

}
