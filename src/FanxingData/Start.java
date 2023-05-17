package FanxingData;

import java.util.ArrayList;

/****************************
 * @project zjhjavawork
 * @package FanxingData
 * @className Start
 * @author Zjiah
 * @date 2023/5/17 21:25
 * @Description:   *
 ****************************/
public class Start {
    public static void main(String[] args) {

        ArrayList<cat> list1 = new ArrayList<>();
        ArrayList<An> list2 = new ArrayList<>();
        wei(list1);
        wei(list2);



    }

    public static void wei(ArrayList<? super cat> list) {
        System.out.println();
    }
}
