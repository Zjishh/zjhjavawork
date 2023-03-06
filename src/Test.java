/****************************
 * @project zjhjavawork
 * @package PACKAGE_NAME
 * @className Test
 * @author Zjiah
 * @date 2023/3/5 21:23
 * @Description:   *
 ****************************/
public class Test {
    public static void main(String[] args) {

        System.out.println(aaa());
        System.out.println(a2());
    }

    private static boolean a2() {
        int[] sums = {6,2,3,4};
        int flat = 0;
        for (int i = 0; i < sums.length-1; i++) {

            if (sums[i]>sums[i+1]){
                int aaa = sums[i];
                sums[i]=sums[i+1];
                sums[i+1]=aaa;
                flat=1;
            }
            if (flat==0){
                System.out.println("结束排序");
                break;
            }
        }
        for (int sum : sums) {
            System.out.println(sum);
        }


        return true;
    }

    public static boolean aaa() {
        int[] sums = {1,2,3,4};

        for (int i = 0; i < sums.length; i++) {
            int cc = sums[i];
            for (int i1 = i+1; i1 < sums.length; i1++) {
                if (sums[i1]==cc){
                    return false;
                }
            }
        }
        return true;
    }
}
