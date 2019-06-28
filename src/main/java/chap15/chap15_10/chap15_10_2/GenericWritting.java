package chap15.chap15_10.chap15_10_2;

import chap15.chap15_10.Apple;
import chap15.chap15_10.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 11:38
 * @Desc
 */
public class GenericWritting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();
    static void f1(){
        writeExact(apples,new Apple());
        writeExact(fruit,new Apple());//erro:Incompatible types: found Fruit,required Apple

    }

    static <T> void writeWithWildCard(List<? super  T> list,T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildCard(apples,new Apple());
        writeWithWildCard(fruit,new Apple());
    }
    public static void main(String[] args){
        f1();
        f2();
    }
}
