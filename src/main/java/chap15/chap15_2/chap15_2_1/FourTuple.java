package chap15.chap15_2.chap15_2_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 10:49
 * @Desc
 */
public class FourTuple<A,B,C,D > extends ThreeTuple<A,B,C> {

    public final D fourth;
    public FourTuple(A a,B b,C c,D d){
        super(a,b,c);
        fourth = d;
    }
    public String toString(){
        return "(" + first + "," + second +","+ third+ ","+ fourth+")";
    }
}
