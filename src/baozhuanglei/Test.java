package baozhuanglei;

import java.util.ArrayList;
import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package baozhuanglei
 * @className Test
 * @author Zjiah
 * @date 2023/5/8 20:49
 * @Description:   *
 ****************************/
public class Test {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (getsum(list)){
            System.out.println("请输入整数");
            String i = scanner.nextLine();
            int num = Integer.parseInt(i);
            if (num>100||num<1){
                System.out.println("重新输入");
                continue;
            }
            list.add(num);

        }

    }

    private static boolean getsum(ArrayList<Integer> list) {
        int sum =0 ;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        if (sum >200){
            System.out.println("满足要求"+sum);
            return false;
        }
        System.out.println(sum);
        return true;
    }


}
