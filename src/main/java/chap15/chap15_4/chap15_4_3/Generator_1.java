package chap15.chap15_4.chap15_4_3;

import chap15.chap15_3.Coffee;
import chap15.chap15_3.CoffeeGenerator_1;
import chap15.chap15_3.Fibonacci_2;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 16:52
 * @Desc 利用生成器填充Collection  用户Genetor的泛型方法
 */
public class Generator_1 {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }
    public static void main(String[] args){
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator_1(), 4);
        for(Coffee c:coffee){
            System.out.println(c);
        }

        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci_2(), 12);
        for(int i: fnumbers){
            System.out.println(i+",");
        }

    }

}
