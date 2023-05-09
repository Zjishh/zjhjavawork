package baozhuanglei;

import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package baozhuanglei
 * @className Test2
 * @author Zjiah
 * @date 2023/5/9 19:32
 * @Description:   *
 ****************************/
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int num = Integer.parseInt(s);

        StringBuilder st = new StringBuilder();

        while (true){
            if (num==0){
                break;
            }
            int yushu = num % 2;
            num /= 2;
            st.insert(0,yushu);

        }
        System.out.println(st);

    }
}
