package fanxing;

/****************************
 * @project zjhjavawork
 * @package fanxing
 * @className Phone
 * @author Zjiah
 * @date 2023/3/6 21:12
 * @Description:   *
 ****************************/
public class Phone {
    private String pinpai;
    private double price;


    public Phone() {
    }

    public Phone(String pinpai, double price) {
        this.pinpai = pinpai;
        this.price = price;
    }

    /**
     * 获取
     * @return pinpai
     */
    public String getPinpai() {
        return pinpai;
    }

    /**
     * 设置
     * @param pinpai
     */
    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{pinpai = " + pinpai + ", price = " + price + "}";
    }
}
