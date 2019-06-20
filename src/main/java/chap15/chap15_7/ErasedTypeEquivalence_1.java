package chap15.chap15_7;

import java.util.ArrayList;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 18:17
 * @Desc
 */
public class ErasedTypeEquivalence_1 {
    public static void main(String[] args){
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);//c1和c2是相同的类型

    }
}
