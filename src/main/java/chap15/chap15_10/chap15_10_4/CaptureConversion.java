package chap15.chap15_10.chap15_10_4;

import chap15.chap15_10.chap15_10_1.Holder;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 15:37
 * @Desc
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());

    }


    static void f2(Holder<?> holder){
        f1(holder);
    }

    public static void main(String[] args){
        Holder raw = new Holder<Integer>(8);
        f1(raw);

        f2(raw);


        Holder rawBasi = new Holder();
        rawBasi.set(new Object());
        f2(rawBasi);


        Holder<?> wilder = new Holder<Double>(1.0);
        f2(wilder);

    }
}
