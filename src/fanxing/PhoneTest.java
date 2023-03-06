package fanxing;

import java.util.ArrayList;

/****************************
 * @project zjhjavawork
 * @package fanxing
 * @className PhoneTest
 * @author Zjiah
 * @date 2023/3/6 21:13
 * @Description:   *
 ****************************/
public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> p = new ArrayList<>();

        Phone ph1 = new Phone("xiaom", 1000);
        Phone ph2 = new Phone("pinguo", 8000);
        Phone ph3 = new Phone("oneplus", 2999);
        
        p.add(ph1);
        p.add(ph3);
        p.add(ph2);

        ArrayList<Phone> diyu = diyu(p, 3000);
        for (int i = 0; i < diyu.size(); i++) {
            System.out.println("品牌是"+diyu.get(i).getPinpai()+"价格是"+diyu.get(i).getPrice());
        }
    }

    private static ArrayList<Phone> diyu(ArrayList<Phone> p, int flot) {
        ArrayList<Phone> newp = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getPrice()<=flot){
                newp.add(p.get(i));
            }
        }
        
        return newp;
    }


}
