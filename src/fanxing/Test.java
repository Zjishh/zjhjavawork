package fanxing;

import java.util.ArrayList;
import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package fanxing
 * @className Test
 * @author Zjiah
 * @date 2023/3/6 18:09
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {
             ArrayList<Student> st = new ArrayList<>();

//        Student s1 = new Student("zjh",22);
//        Student s2 = new Student("zjwh",222);
//        Student s3 = new Student("zjqdwh",2222);
//
//        st.add(s1);
//        st.add(s2);
//        st.add(s3);
//
//        for (int i = 0; i < st.size(); i++) {
//            System.out.println(st.get(i).getName());
//        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("请输入第"+(i+1)+"个学生姓名");
            String name = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生年龄");
            int age = sc.nextInt();
            student.setName(name);
            student.setAge(age);
            st.add(student);
            System.out.println("弟"+i+1+"个学生信息"+st.get(i));
        }
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }

    }
}
