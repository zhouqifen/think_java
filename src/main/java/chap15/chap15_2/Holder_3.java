package chap15.chap15_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 16:36
 * @Desc
 */
public class Holder_3<T> {//T叫做类型参数
    private  T a;
    public Holder_3(T a){
        this.a=a;
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args){
        Holder_3<AutoMobile> h3 = new Holder_3<AutoMobile>(new AutoMobile());
        AutoMobile autoMobile = h3.get();//这就不用强转
        System.out.println(autoMobile);

        //h3.set("Not an AutoMobile");
        //h3.set(1);


    }
}
