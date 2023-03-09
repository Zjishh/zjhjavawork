package util;

import java.util.ArrayList;

import static util.studentUtil.getMax;

/****************************
 * @project zjhjavawork
 * @package util
 * @className Start
 * @author Zjiah
 * @date 2023/3/7 15:19
 * @Description:   *
 ****************************/
public class Start {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("张家豪",232322);
        Student s2 = new Student("张2家豪",22666662);
        Student s3 = new Student("张家3豪",2233);

        students.add(s1);
        students.add(s2);
        students.add(s3);


        System.out.println(students.get(getMax(students)));


    }
}
