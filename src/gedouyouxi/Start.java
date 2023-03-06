package gedouyouxi;

/****************************
 * @project zjhjavawork
 * @package gedouyouxi
 * @className Start
 * @author Zjiah
 * @date 2023/3/3 18:08
 * @Description:   *
 ****************************/
public class Start {
    public static void main(String[] args) {
        People people1 = new People("张家豪",100,1);
        People people2 = new People("侯姗姗",100,0);
        people1.getFace();
        people2.getFace();
        while (people1.getBlood()!=0&&people2.getBlood()!=0){
            people1.attack(people2);
            if (people2.getBlood()==0){
                System.out.println(people2.getName()+"被打死了");
                break;
            }
            people2.attack(people1);
            if (people1.getBlood()==0){
                System.out.println(people1.getName()+"被打死了");
                break;
            }

        }

    }
}
