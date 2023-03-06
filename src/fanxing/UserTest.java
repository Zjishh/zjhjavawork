package fanxing;

import java.util.ArrayList;
import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package fanxing
 * @className UserTest
 * @author Zjiah
 * @date 2023/3/6 20:46
 * @Description:   *
 ****************************/
public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();

        User user1 = new User(1,"zjh","888");
        User user2 = new User(2,"zjwwh","8882");
        User user3 = new User(3,"zjheeeee","88228");

        user.add(user1);
        user.add(user2);
        user.add(user3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的ID");
        int scid = scanner.nextInt();

        int flag = panduan(user, scid);
        if(flag==-1){
            System.out.println("ID不存在");
        }else{
         System.out.println("你查询的ID为"+ user.get(flag).getId()+"的用户，用户名为"+ user.get(flag).getUsername()+"密码为"+ user.get(flag).getPassword());

        }
    }

    private static int panduan(ArrayList<User> user, int scid) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getId()== scid){
                return i;
            }
        }
        return -1;
    }
}
