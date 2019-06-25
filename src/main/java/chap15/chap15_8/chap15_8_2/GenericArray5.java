package chap15.chap15_8.chap15_8_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 18:34
 * @Desc
 */
public class GenericArray5<T> {
    private T[] array;
    public GenericArray5(int sz){
        array = (T[])new Object[sz];
    }

    public void put(int index,T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return  array;
    }

    public static void main(String[] args){
        GenericArray5<Integer> gai = new GenericArray5<Integer>(10);
        Integer[] ia = gai.rep();// 编译时通过,运行时报错,类型转换异常
        Object[] oa = gai.rep();//因为有了擦除
    }
}
