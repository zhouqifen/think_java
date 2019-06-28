package chap15.chap15_11.chap15_11_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 15:56
 * @Desc
 */
public class ListOfInt {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i<5;i++){
            li.add(i);
        }
        for(int i: li){
            System.out.println(i + " ");
        }


    }
}
