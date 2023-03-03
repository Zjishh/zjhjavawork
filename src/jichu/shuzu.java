package jichu;

/****************************
 * @project zjhjavawork
 * @package jichu
 * @className shuzu
 * @author Zjiah
 * @date 2023/2/28 14:48
 * @Description:   *
 ****************************/
public class shuzu {
    public static void main(String[] args) {
        int[] sum = {1,2,3,4,5,6,7,8,9};
        int e= 3;
        printSum(sum);
        getMax(sum);
        getI(sum,e);
        getIpro(sum,e);
        if (getIpro(sum,e)== true) {
            System.out.println("存在");
        }else {
            System.out.println("bucnuzai");
        }
        int from=3,to=5;

        int[] resm=copyS(sum,from,to);
        for (int i = 0; i < resm.length; i++) {
            System.out.println(resm[i]);
        }
    }

    private static int[] copyS(int[] sum, int from, int to) {
        int[] newS =new int[to-from];
        int p =0;
        for (int i = from; i < to; i++) {
            newS[p] = sum[i];
            p++;
        }

        return newS;

    }

    private static void getI(int[] sum, int e) {
        int flot=0;
        for (int i = 0; i < sum.length; i++) {
            if (e==sum[i]){
                flot = 1;
                break;
            }
        }
        if (flot == 1){
            System.out.println("存在");
        }
        else{
            System.out.println("不存在");
        }

    }
    private static boolean getIpro(int[] sum, int e) {

        for (int i = 0; i < sum.length; i++) {
            if (e==sum[i]){

                return true;
            }
        }
       return false;

    }


    public static void printSum(int[] x) {
        System.out.print("[");
        for (int i = 0; i < x.length; i++) {
            if (i == x.length-1){
                System.out.println(x[i]+"]");
            }
            else {
                System.out.print(x[i]+",");
            }

        }

    }

    public static void getMax(int[] x) {
        int m = x[0];
        for (int i = 1; i < x.length; i++) {

            if(m<x[i]){
                m=x[i];
            }

        }
        System.out.println("最大值是"+m);
    }
}
