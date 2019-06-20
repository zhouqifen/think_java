package chap15.chap15_3;

import java.util.Iterator;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 15:54
 * @Desc 使用继承创建适配器
 */
public class IterableFibonacci extends Fibonacci_2 implements Iterable<Integer> {//通过继承来创建适配器
    private int n;
    public IterableFibonacci(int count){
        n=count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n>0;
            }

            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            public void remove() {
                throw  new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args){
        for(int i : new IterableFibonacci(18)){//必须要传一个参数,使得n有个界值,好让hasNext方法返回false
            System.out.println(i + " ");
        }
    }
}
