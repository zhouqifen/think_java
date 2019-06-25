package chap15.chap15_8.chap15_8_2;

import java.lang.reflect.Array;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 19:10
 * @Desc 对于新代码,应该传递一个类型标记
 */
public class GenericArrayWithTypeToken7<T> {
    private T[] array;
    //类型标记Class<T>被传递到了构造器中,以便从擦除中恢复,使得我们可以创建需要的实际类型的数组
    public  GenericArrayWithTypeToken7(Class<T> type,int sz){
        array = (T[])Array.newInstance(type,sz);

    }

    public void put(int index,T item){
        array[index] = item;
    }

    public T get(int index){
        return  array[index];
    }
    public T[] rep(){
        return array;
    }
    public static void main(String[] args){
        GenericArrayWithTypeToken7<Integer> gai = new GenericArrayWithTypeToken7<Integer>(Integer.class,10);
        Integer[] rep = gai.rep();
        System.out.println(rep);

    }

}
