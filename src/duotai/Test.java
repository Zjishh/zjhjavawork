package duotai;

/****************************
 * @project zjhjavawork
 * @package duotai
 * @className Test
 * @author Zjiah
 * @date 2023/3/10 20:46
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("吕梁鹏");
        teacher.setAge(28);

        Student student = new Student();
        student.setName("乔晓");
        student.setAge(21);

        Admin admin = new Admin();
        admin.setName("张家豪");
        admin.setAge(22);


        reg(teacher);
        reg(student);
        reg(admin);


    }

    public static void reg(Person p) {
        p.show();
    }
}
