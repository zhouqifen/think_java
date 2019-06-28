package chap15.chap15_10.chap15_10_2;

import chap15.chap15_10.Apple;
import chap15.chap15_10.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 14:14
 * @Desc
 */
public class GenericReading {
    static <T> T readExact(List<T> list){
        return list.get(0);
    }
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    // a static method adapts to each call
    static void f1(){
        Apple a = readExact(apples);
        Fruit f = readExact(GenericReading.fruit);
        f = readExact(apples);
    }

    static class Reader<T>{
        T readExact(List<T> list){
            return list.get(0);
        }
    }

    static void f2(){
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        Fruit f = fruitReader.readExact(fruit);
        //fruitReader.readExact(apples);//Error :readExact(List<T> list) cannot be  applied to List<Apple>
    }

    static class ConvariantReader<T> {
        T readConvariant(List<? extends  T> list){
            return list.get(0);
        }
    }

    static void f3(){
        ConvariantReader<Fruit> fruitConvariantReader = new ConvariantReader<Fruit>();
        Fruit f = fruitConvariantReader.readConvariant(GenericReading.fruit);
        Fruit a = fruitConvariantReader.readConvariant(apples);

    }
    public static void main(String[] args){
        f1();
        f2();
        f3();
    }


}
