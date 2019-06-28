package chap15.chap15_10.chap15_10_1;

import chap15.chap15_10.Apple;
import chap15.chap15_10.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 10:55
 * @Desc
 */
public class CompilerIntelligence {
    public static void main(String[] args){
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple apple = (Apple) flist.get(0);
        System.out.println(apple);
        //flist.add(new Apple()); complier error
        flist.contains(new Apple());//Argument is 'Object'
        flist.indexOf(new Apple());
    }
}
