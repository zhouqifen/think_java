package chap15.chap15_10.chap15_10_1;

import chap15.chap15_10.Apple;
import chap15.chap15_10.Fruit;
import chap15.chap15_10.Orange;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 11:04
 * @Desc
 */
public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){
        value = val;
    }
    public void set(T val){
        value= val;
    }
    public T get(){
        return value;
    }
    public boolean equals(Object obj){
        return value.equals(obj);
    }
    public static void main(String[] args){
        Holder<Apple> apple= new Holder<Apple>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        //Holder<Fruit> fruit = apple;// compiler error     cannot upcast
        Holder<? extends  Fruit> fruit = apple; //ok
        Fruit p = fruit.get();
        d = (Apple)fruit.get();// return  Object

        try {
            Orange orange = (Orange) fruit.get();// no warning  运行时报ClassCastException

        } catch (Exception e) {
            System.out.println(e);
        }
        //fruit.set(new Apple());//compiler error cannot call set();
        //fruit.set(new Fruit());//compiler error cannot call set();
        System.out.println(fruit.equals(d));// ok return true
    }

}
