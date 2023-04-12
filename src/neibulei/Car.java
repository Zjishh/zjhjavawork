package neibulei;

/****************************
 * @project zjhjavawork
 * @package neibulei
 * @className Car
 * @author Zjiah
 * @date 2023/4/12 10:24
 * @Description:   *
 ****************************/
public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public void show(){

        System.out.println();
        Engine engine = new Engine();
        System.out.println(engine.eName);
    }

    class Engine{
        String eName;
        int eAge;
        public void show(){
            System.out.println(eName+eAge);
            System.out.println(carAge+carColor+carName);
        }
    }
}
