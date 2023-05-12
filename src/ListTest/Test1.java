package ListTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/****************************
 * @project zjhjavawork
 * @package ListTest
 * @className Test1
 * @author Zjiah
 * @date 2023/5/10 15:28
 * @Description:   *
 ****************************/
public class Test1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        Collection<Student> coll = new ArrayList<>();


        //2.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);


        //3.把学生对象添加到集合当中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhangsan",23);
        //因为contains方法在底层依赖equals方法判断对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，而Object类中equals方法，依赖地址值进行判断。
        //需求：如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法就可以了。
        System.out.println(coll.contains(s4));




        ////-----------0--
        /*
            Collection系列集合三种通用的遍历方式：
                1.迭代器遍历
                2.增强for遍历
                3.lambda表达式遍历


             迭代器遍历相关的三个方法：
                    Iterator<E> iterator()  ：获取一个迭代器对象
                    boolean hasNext()       ：判断当前指向的位置是否有元素
                    E next()                ：获取当前指向的元素并移动指针
        */

        //1.创建集合并添加元素
        Collection<String> colll = new ArrayList<>();
        colll.add("aaa");
        colll.add("bbb");
        colll.add("ccc");
        colll.add("ddd");
//999
        //2.获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = colll.iterator();
        //3.利用循环不断的去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

    }


}
