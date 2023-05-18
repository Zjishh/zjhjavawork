package LinkdListTest;

import util.Student;

import java.util.LinkedHashSet;
import java.util.List;

/****************************
 * @project zjhjavawork
 * @package LinkdListTest
 * @className LinkedHashSetDemo
 * @author Zjiah
 * @date 2023/5/18 21:01
 * @Description:   *
 ****************************/
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Student student = new Student("zjh",1);
        Student student2 = new Student("zj2h",112);
        Student student3 = new Student("z3j2h",21211);
        Student student4 = new Student("zj4h",1332);
        Student student5 = new Student("zj4h",1332);


        LinkedHashSet<Student> objects = new LinkedHashSet<>();

        objects.add(student);
        objects.add(student2);
        objects.add(student3);
        objects.add(student4);
        System.out.println(objects.add(student5));

        System.out.println(objects);
    }
}
