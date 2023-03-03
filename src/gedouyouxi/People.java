package gedouyouxi;

import java.util.Random;

/****************************
 * @project zjhjavawork
 * @package gedouyouxi
 * @className People
 * @author Zjiah
 * @date 2023/3/3 17:58
 * @Description:   *
 ****************************/
public class People {
    private String name;
    private int blood;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    private int sex;
    private String face;
    String[] bface = {"风流倜傥","英俊潇洒","器宇轩昂","面目狰狞"};
    String[] gface = {"貌美如花","沉鱼落雁","亭亭玉立","惨不忍睹"};

    String[] att = {
            "%s使劲打了%s一下",
            "%s超级使劲使劲的打了%s一下",
            "%s呼了%s一巴掌",
            "%s踹了一%s一脚"
    };

    public String getFace() {

        return face;
    }

    public void setFace(int sex) {
        Random r = new Random();
        int i = r.nextInt(4);
        if (sex==1){
            this.face=bface[i];
        }
        else{
            this.face=gface[i];

        }
        
        this.face = face;
    }

public void showInfo(){
    System.out.println("姓名"+getName());
    System.out.println("血量"+getBlood());
    System.out.println("性别为"+(getSex()==1? "男":"女"));
    System.out.println("长得"+getFace());
}


    public People() {

    }

    public People(String name, int blood,int sex) {
        this.name = name;
        this.blood = blood;
        this.sex = sex;
        setFace(sex);
        showInfo();
    }


    //定义方法攻击别人
    public void attack(People people){
        Random random = new Random();
        int i = random.nextInt(20) + 1;
        int i2 = random.nextInt(4);
        String att = this.att[i2];
        System.out.printf(att,this.getName(),people.name);
        System.out.println();

        //挨揍人的血量
        int beizou = people.getBlood() - i;
        beizou=beizou<0 ? 0:beizou;
        people.setBlood(beizou);
//        System.out.println(this.name+"打了"+people.name+"一下,造成了"+i+"伤害"+people.name+"还剩"+beizou+"点血");
        System.out.println("造成了"+i+"伤害,"+people.name+"还剩"+beizou+"点血");

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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "People{name = " + name + ", blood = " + blood + "}";
    }
}
