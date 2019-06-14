package chap15.chap15_2.chap15_2_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 17:15
 * @Desc
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A a, B b, C c){
        super(a,b);
        third = c;
    }
    public String toString(){
        return "("+ first +", "+second + ", "+third+")";
    }
    public static void main(String[] args){
        String haha = new String("haha");
        StringBuilder sb = new StringBuilder("xixi");
        StringBuffer buf = new StringBuffer("hehe");
        ThreeTuple<String, StringBuilder, StringBuffer> tt = new ThreeTuple<String, StringBuilder, StringBuffer>(haha, sb, buf);
        System.out.println(tt);
    }

}
