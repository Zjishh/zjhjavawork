package jichu;

import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package jichu
 * @className bijioa
 * @author Zjiah
 * @date 2023/2/28 14:27
 * @Description:   *
 ****************************/
public class bijioa {
    public static void main(String[] args) {
        System.out.println("输入第一个长宽");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();
        int res1 = getSum(x,y);

    }

    public static int getSum(int x,int y) {
        int resout = x*y;
        return resout;

    }
}
