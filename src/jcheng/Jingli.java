package jcheng;

/****************************
 * @project zjhjavawork
 * @package jcheng
 * @className Jingli
 * @author Zjiah
 * @date 2023/3/10 19:36
 * @Description:   *
 ****************************/
public class Jingli extends People {
    private double jiangjin;

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    public Jingli() {
    }

    public Jingli(double jiangjin) {
        this.jiangjin = jiangjin;
    }

    public Jingli(String id, String name, double gongzi, double jiangjin) {
        super(id, name, gongzi);
        this.jiangjin = jiangjin;
    }

    /**
     * 获取
     * @return jiangjin
     */
    public double getJiangjin() {
        return jiangjin;
    }

    /**
     * 设置
     * @param jiangjin
     */
    public void setJiangjin(double jiangjin) {
        this.jiangjin = jiangjin;
    }


    public String toString() {
        return "Jingli{jiangjin = " + jiangjin + "}";
    }
}
