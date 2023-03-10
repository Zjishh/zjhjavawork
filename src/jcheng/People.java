package jcheng;

/****************************
 * @project zjhjavawork
 * @package jcheng
 * @className People
 * @author Zjiah
 * @date 2023/3/10 19:38
 * @Description:   *
 ****************************/
public class People {

    private String id;
    private String name;
    private double gongzi;

    public People() {
    }

    public People(String id, String name, double gongzi) {
        this.id = id;
        this.name = name;
        this.gongzi = gongzi;
    }
    public void eat(){
        System.out.println("吃米饭");
    }
    public void work(){
        System.out.println("员工在工作");
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gongzi
     */
    public double getGongzi() {
        return gongzi;
    }

    /**
     * 设置
     * @param gongzi
     */
    public void setGongzi(double gongzi) {
        this.gongzi = gongzi;
    }


}
