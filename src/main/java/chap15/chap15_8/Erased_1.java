package chap15.chap15_8;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 11:23
 * @Desc 擦除的代价是显著的,泛型不能用于显式地引用运行时类型的操作之中
 * 例如: 转型 , instanceof操作 和 new 表达式
 */
public class Erased_1<T> {
    private final int SIZE =100;
    public static void f(Object arg){
        //if(arg instanceof T){}  //error
        //T var = new T(); //error  报错的一部分原因是因为擦除,另一部分原因是因为编译器不能验证T具有默认(无参)构造器
        //T[] arrayts = new T[SIZE]; //error
        //T[] array = (T)new Object[SIZE]; //error

    }
}
