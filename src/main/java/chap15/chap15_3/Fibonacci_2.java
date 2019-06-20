package chap15.chap15_3;

import net.mindview.util.Generator;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 11:58
 * @Desc
 */
public class Fibonacci_2 implements Generator<Integer> {
    private int  count = 0;

    public Integer next() {//类型参数补不能使用基本数据类型,只能使用基本类型的包装类
        return fib(count++);
    }

    private int fib(int n){
        if(n<2){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args){
        Fibonacci_2 gen = new Fibonacci_2();
        for(int i = 0;i<18;i++){
            System.out.println(gen.next()+" ");
        }
    }
}
