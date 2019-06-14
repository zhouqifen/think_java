package chap15.chap15_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 16:28
 * @Desc
 */
public class Holder_2 {
    private Object a;
    public Holder_2(Object a){
        this.a=a;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public static void main(String[] args){
        Holder_2 h2 = new Holder_2(new AutoMobile());
        AutoMobile a = (AutoMobile)h2.getA();
        System.out.println(a);

        h2.setA("Not an AutoMobile");
        String s = (String)h2.getA();
        System.out.println(s);

        h2.setA(1);
        Integer x = (Integer) h2.getA();
        System.out.println(x);
    }
}
