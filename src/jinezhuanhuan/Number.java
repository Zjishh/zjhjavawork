package jinezhuanhuan;

import java.util.Scanner;

/****************************
 * @project zjhjavawork
 * @package jinezhuanhuan
 * @className Number
 * @author Zjiah
 * @date 2023/3/5 16:36
 * @Description:   *
 ****************************/
public class Number {
    public static void main(String[] args) {
        System.out.println("请输入金额");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(zhuanhuan2(i));

    }

    public static String zhuanhuan(int i) {
        String s="";
        String[] dainwei = {"元","拾","百","千","万","拾","百","千"};
        int cont=0;String bnum = null;
        while (i%10==0){
            bnum ="零";
            s="元";
            i/=10;
            cont++;
        }
        while (i%10!=0){
            switch (i%10){

                case 1 : bnum ="壹";break;
                case 2 : bnum ="贰";break;
                case 3 : bnum ="叁";break;
                case 4 : bnum ="肆";break;
                case 5 : bnum ="伍";break;
                case 6 : bnum ="陆";break;
                case 7 : bnum ="柒";break;
                case 8 : bnum ="捌";break;
                case 9 : bnum ="玖";break;

            }
            s = bnum+dainwei[cont]+s;
            i/=10;
            cont++;
        }

        return s;
    }

    public static String zhuanhuan2(int i) {
        String res="";
        String[] dainwei = {"元","拾","百","千","万","拾","百","千"};
        String[] bnum = new String[20];
        int p = 0;
        while (i!=0){
            int yushu = i % 10;
                switch (yushu){
                    case 0 : bnum[p] ="零";break;
                    case 1 : bnum[p] ="壹";break;
                    case 2 : bnum[p] ="贰";break;
                    case 3 : bnum[p] ="叁";break;
                    case 4 : bnum[p] ="肆";break;
                    case 5 : bnum[p] ="伍";break;
                    case 6 : bnum[p] ="陆";break;
                    case 7 : bnum[p] ="柒";break;
                    case 8 : bnum[p] ="捌";break;
                    case 9 : bnum[p] ="玖";break;
                }
            i/=10;
            p++;
        }
        for (int i1 = 0; i1 < dainwei.length; i1++) {
            if (bnum[i1].equals("零")){

            }
            res=bnum[i1]+dainwei[i1]+res;
            if (bnum[i1+1]==null){
                break;
            }
        }

        return res;
    }
}
