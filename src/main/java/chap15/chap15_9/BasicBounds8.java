package chap15.chap15_9;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 11:02
 * @Desc
 */
public class BasicBounds8 {
    public static void main(String[] args){
        Solid6<Bounded7> solid = new Solid6<Bounded7>(new Bounded7());
        solid.color();
        solid.getY();
        solid.weight();
    }
}
