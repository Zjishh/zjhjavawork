package util;

import java.util.ArrayList;

/****************************
 * @project zjhjavawork
 * @package util
 * @className studentUtil
 * @author Zjiah
 * @date 2023/3/7 15:04
 * @Description:   *
 ****************************/
public class studentUtil {
    private studentUtil(){

    }
    public static int getMax(ArrayList<Student> s){
        int maxindex=0;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getAge()>s.get(maxindex).getAge()){
                maxindex=i;
                System.out.println(666);
            }
        }


        return maxindex;
    }
}
