package chap15.chap15_4.chap15_4_5;

import chap15.chap15_2.chap15_2_1.TwoTuple;
import net.mindview.util.ThreeTuple;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 17:28
 * @Desc
 */
public class Tuple {
    public static <A,B> TwoTuple<A,B> tuple(A a,B b){
        return new TwoTuple<A,B>(a,b);
    }

    public static <A,B,C> ThreeTuple<A,B,C> tuple(A a,B b,C c){
        return new ThreeTuple<A,B,C>(a,b,c);
    }
}
