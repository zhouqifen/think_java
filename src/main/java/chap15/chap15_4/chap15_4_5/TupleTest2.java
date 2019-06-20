package chap15.chap15_4.chap15_4_5;

import chap15.chap15_2.chap15_2_1.TwoTuple;
import static chap15.chap15_4.chap15_4_5.Tuple.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 17:38
 * @Desc 测试tuple
 */
public class TupleTest2 {
    static TwoTuple<String,Integer> f(){
        return tuple("hi",47);
    }
    static TwoTuple  f2(){
        return tuple("hi",47);
    }
    public static void main(String[] args){
        TwoTuple<String, Integer> f = f();
        TwoTuple<String, Integer> f2 = f2();

        System.out.println(f);
        System.out.println(f2);
    }

}
