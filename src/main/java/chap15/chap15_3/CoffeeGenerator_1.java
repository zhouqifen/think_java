package chap15.chap15_3;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;


/**
 * @Author: zhouqifen
 * @Date:2019/6/19 10:28
 * @Desc
 */
public class CoffeeGenerator_1 implements Generator<Coffee>,Iterable<Coffee> {


    private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
    private static Random rand = new Random(47);

    public CoffeeGenerator_1(){}
    private int size = 0;
    public CoffeeGenerator_1(int sz){
        size = sz;
    }

    public Coffee next() {
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw  new RuntimeException();
        }
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        public boolean hasNext(){
            return count>0;
        }
        public Coffee next(){
            count--;
            return CoffeeGenerator_1.this.next();
        }
        public void remove(){
            throw  new UnsupportedOperationException();
        }
    };

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args){
        CoffeeGenerator_1 gen = new CoffeeGenerator_1();
        for(int i = 0;i<5;i++){
            System.out.println(gen.next());
        }

        //这提现实现了Iterable接口的功能
        for(Coffee c:new CoffeeGenerator_1(5)){
            System.out.println(c);
        }

    }
}
