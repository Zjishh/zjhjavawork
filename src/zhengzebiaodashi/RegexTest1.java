package zhengzebiaodashi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/****************************
 * @project zjhjavawork
 * @package zhengzebiaodashi
 * @className RegexTest1
 * @author Zjiah
 * @date 2023/4/21 19:59
 * @Description:   *
 ****************************/
public class RegexTest1 {
    public static void main(String[] args) throws IOException {
        String QQ ="0385802188";



        System.out.println(QQ.matches("[1-9]\\d{5,19}"));

        String yonghuming = "ZjH_666";

        System.out.println(yonghuming.matches("\\w{4,16}"));

        String shenfenzheng = "37130220010915141x";

        System.out.println(shenfenzheng.matches("[1-9]\\d{16}[Xx]"));

        System.out.println(shenfenzheng.matches(""));


        String s = "身份证号大全\n" +
                " 全国身份证号码和真实姓名大全示例   \n" +
                "身份证号码查询\t\n" +
                "请输入18位二代身份证号码\n" +
                "其它查询\t\n" +
                "郎岩\t23540719510611274X\t66\t女\t黑龙江省. 黑龙江省农垦红兴隆管理局. 北兴农场\n" +
                "孟琬\t21020319750310272x\t42\t女\t辽宁省. 大连市. 西岗区\n" +
                "杭健雯\t130102196303250459\t54\t男\t河北省. 石家庄市. 长安区\n" +
                "柯琼彦\t511502199103223189\t26\t女\t四川省. 宜宾市. 翠屏区\n" +
                "方华\t431202198811101720\t29\t女\t湖南省. 怀化市. 鹤城区\n" +
                "常善勤\t130821199103278829\t26\t女\t河北省. 承德市. 承德县\n" +
                "戚轮伯\t520323197806058856\t39\t男\t贵州省. 遵义市. 绥阳县\n" +
                "伏佳\t350105199506138487\t22\t女\t福建省. 福州市. 马尾区\n" +
                "狄彪树\t610729197408202551\t43\t男\t陕西省. 汉中市. 留坝县\n" +
                "平明奇\t820000195008115837\t67\t男\t澳门特别行政区. 澳门特别行政区. 澳门特别行政区\n" +
                "平璐\t450101197405207446\t43\t女\t广西壮族自治区. 南宁市. 市辖区\n" +
                "单雁\t411626198204167401\t35\t女\t河南省. 周口市. 淮阳县\n" +
                "舒宏\t654022197901228286\t38\t女\t新疆维吾尔自治区. 伊犁哈萨克自治州. 察布查尔锡伯自治县\n" +
                "汤琪\t152224198908049211\t28\t男\t内蒙古自治区. 兴安盟. 突泉县\n" +
                "狄莉珍\t230822197201256034\t45\t男\t黑龙江省. 佳木斯市. 桦南县";


        URL url = new URL("http://list.chineseidcard.com/sfz/150000.html");

        URLConnection urlConnection = url.openConnection();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String neirong ;
        StringBuffer strb = new StringBuffer();

       while ((neirong = bufferedReader.readLine())!= null ){
           strb.append(neirong);


       }
        System.out.println(strb);



        Pattern compile = Pattern.compile("([1-9]\\d{15}[13579][0-9Xx])|([男])");
        Matcher m = compile.matcher(s);
        int cont=0;
        while (m.find()){
            cont++;
            String str = m.group ();
            System.out.println(str);
        }
        System.out.println("共"+cont+"个");


        /*
        //获取正则表达式对象
        Pattern compile = Pattern.compile("阿伟\\d{0,1000000}");

        //获取文本匹配器对象
        Matcher m = compile.matcher(s);

        //拿着文本匹配其从头开始读取，序偶找死否有满足规则的子串，没有false
        //有true 在底层记录子串的起始索引和结束索引+1
        boolean b = m.find();
        String group = m.group();
        System.out.println(group);
//继续读取
        b = m.find();*/
    }


}
