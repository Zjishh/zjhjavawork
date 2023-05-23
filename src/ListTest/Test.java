package ListTest;

import java.util.Comparator;
import java.util.TreeSet;

/****************************
 * @project zjhjavawork
 * @package ListTest
 * @className Test
 * @author Zjiah
 * @date 2023/5/19 10:12
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {

        Studentaa studentaa1 = new Studentaa("一",18,100,100,100);
        Studentaa studentaa2 = new Studentaa("er",18,100,99,88);
        Studentaa studentaa3 = new Studentaa("dsad",18,82,100,77);
        Studentaa studentaa4 = new Studentaa("sdaad",18,25,100,74);
        Studentaa studentaa5 = new Studentaa("fdg",18,52,14,58);
        Studentaa studentaa6 = new Studentaa("fasgh",18,25,100,100);

        TreeSet<Studentaa> studentaas = new TreeSet<>(new Comparator<Studentaa>() {
            @Override
            public int compare(Studentaa o1, Studentaa o2) {
                int i = o1.getYinyu() - o2.getYuwen();

                System.out.println(o1.getYinyu());
                return i;
            }
        });

        studentaas.add(studentaa1);
        studentaas.add(studentaa2);
        studentaas.add(studentaa3);
        studentaas.add(studentaa4);
        studentaas.add(studentaa5);
        studentaas.add(studentaa6);

        studentaas.forEach(System.out::println);
    }
}
