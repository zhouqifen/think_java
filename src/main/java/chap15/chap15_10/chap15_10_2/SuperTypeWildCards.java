package chap15.chap15_10.chap15_10_2;

import chap15.chap15_10.Apple;
import chap15.chap15_10.Fruit;
import chap15.chap15_10.Jonathan;

import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 11:31
 * @Desc 超类型边界符
 */
public class SuperTypeWildCards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
        //apples.add(new Fruit());//compiler error

        System.out.println(apples);
    }
}
