package chap15.chap15_10.chap15_10_3;

import chap15.chap15_10.chap15_10_1.Holder;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 15:05
 * @Desc
 */
public class WildCards {
    // Raw argument 原生类型
    static void rawArgs(Holder holder, Object arg){
        holder.set(arg);
        holder.set(new WildCards());
        Object obj = holder.get();
        //T t = holder.get();
    }



    static void unboundedArg(Holder<?> holder,Object arg){
       // holder.set(arg); // error
       // holder.set(new WildCards());

        Object o = holder.get();

    }

    static <T> T exact1(Holder<T> holder){
        T t = holder.get();
        return  t;
    }

    static <T> T exact2(Holder<T> holder,T arg){
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubType(Holder<? extends T> holder, T arg){
       // holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> void wildSuperType(Holder<? super T> holder,T arg){
        holder.set(arg);
        Object object = holder.get();//ok
        //T t = holder.get();//eror
    }
    public static void main(String[] args){
        Holder raw = new Holder<Long>();
        raw = new Holder();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1L;

        rawArgs(raw,lng);
        rawArgs(qualified,lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,lng);

        unboundedArg(raw,lng);
        unboundedArg(qualified,lng);
        unboundedArg(unbounded,lng);
        unboundedArg(bounded,lng);


    }
}
