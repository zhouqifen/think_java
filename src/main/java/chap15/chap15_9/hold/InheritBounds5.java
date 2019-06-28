package chap15.chap15_9.hold;

import chap15.chap15_9.Bounded7;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 11:56
 * @Desc
 */
public class InheritBounds5 {
    public static void main(String[] args){
        Solid2_4<Bounded7> solid2 = new Solid2_4<Bounded7>(new Bounded7());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }
}
