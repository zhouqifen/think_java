package chap15.chap15_2.chap15_2_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 10:54
 * @Desc
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E fifth;
    public FiveTuple(A a,B b,C c,D d,E e){
        super(a,b,c,d);
        fifth = e;
    }
    public String toString(){
        return "(" + first + "," + second +","+ third+ ","+ fourth+","+fifth+")";
    }
}
