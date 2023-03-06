package jichu;

import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package jichu
 * @className Huiwen
 * @author Zjiah
 * @date 2023/2/27 14:59
 * @Description:   *
 ****************************/

public class Huiwen {
    public static void main(String[] args) {
        System.out.println("输入");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int tempx = x;
        int y= 0 , res = 0;

      while(x!=0){
          y = x % 10;
          res = res*10+y;
          x=x/10;
      }if(res==tempx){
            System.out.println("是回文");
        }else
        {
            System.out.println("bushi回文");
        }

    }
}
