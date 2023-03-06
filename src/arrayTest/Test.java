package arrayTest;

/****************************
 * @project zjhjavawork
 * @package arrayTest
 * @className Test
 * @author Zjiah
 * @date 2023/3/5 13:23
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {
//        Goods[] arr = new Goods[3];
//        Goods zjh = new Goods("1", "ZJH", 12.138, 6);
//        Goods zjhh = new Goods("3", "ZJrfH", 1565.138, 99);
//        Goods zjhhh = new Goods("4", "ZJedwH", 125.138, 5);
//
//        arr[0] =zjh;
//        arr[1] =zjhh;
//        arr[2] =zjhhh;
//
//        for (int i = 0; i < arr.length; i++) {
//            Goods goods = arr[i];
//            System.out.println(goods.getId());
//            System.out.println(goods);
//        }


        Student[] student = new Student[3];
        Student s1 = new Student(111,"张家豪",22);
        Student s2 = new Student(222,"张家dsdsd豪",222);
        Student s3 = new Student(222,"张家ds豪",221);

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;




        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }

        Student s4 = new Student(222,"张家dsdsd豪",222);
        boolean c = c(student, s4.getId());
        if (c==false){
            System.out.println("已存在");
        }else
        {
            boolean cunman = cunman(student);
            if (cunman){
                
            }else {

            }
        }


    }

    public static boolean cunman(Student[] student) {
        if(student[student.length-1]==null){
            return true;
        }else {
            System.out.println("manle");
            return false;
        }

    }

    public static boolean c(Student[] student,int id) {
        for (int i = 0; i < student.length; i++) {
            Student student1 = student[i];
            int id1 = student1.getId();
            if (id1 == id){
                System.out.println("已存在");
                return false;
            }
        }
        System.out.println("不存在");
        return false;
    }
}
