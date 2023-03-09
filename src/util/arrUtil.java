package util;

/****************************
 * @project zjhjavawork
 * @package util
 * @className printUtil
 * @author Zjiah
 * @date 2023/3/7 14:44
 * @Description:   *
 ****************************/
public class arrUtil {
    private arrUtil() {
    }

    public static String printUtiil(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuilder.append(arr[i]).append("]");
                break;
            }
            stringBuilder.append(arr[i]).append(",");
        }
        return stringBuilder.toString();
    }

    public static int getAVG(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum / arr.length;


    }


    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5, 6, 7};


        System.out.println(getAVG(s));
        System.out.println(printUtiil(s));
    }
}
