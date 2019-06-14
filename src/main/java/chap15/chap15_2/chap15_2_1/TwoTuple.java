package chap15.chap15_2.chap15_2_1;

import chap15.chap15_2.Holder_1;
import chap15.chap15_2.Holder_2;
import chap15.chap15_2.Holder_3;

import java.applet.AudioClip;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 16:54
 * @Desc
 */
public class TwoTuple<A,B> {
    public final  A first;
    public final B second;
    public TwoTuple(A a , B b){
        first = a;
        second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public String toString(){
        return "("+first + ", "+ second + ")";
    }
    public static void main(String[] args){
        String s  = new String("hehe");
        StringBuilder sb = new StringBuilder("嘻嘻");

        TwoTuple twoTuple = new TwoTuple<String,StringBuilder>(s, sb);
        System.out.println(twoTuple);
    }


}
