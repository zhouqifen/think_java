package chap15.chap15_7.chap15_7_4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 10:17
 * @Desc  边界处的动作
 */
public class ArrayMaker_1<T> {
    private Class<T> kind;
    public ArrayMaker_1(Class<T> kind){//即使kind被存为Class<T> ,擦除也意味着kind实际将被存为Class
        this.kind = kind;

    }
    T[] create(int size){
        //Array.newInstance(kind,size)实际上并未拥有kind所蕴含的类型信息
        return (T[])Array.newInstance(kind,size);//在泛型中创建数组,使用Array.newInstance()是推荐的方式
    }

    public static void main(String[] args){
        ArrayMaker_1<String> maker = new ArrayMaker_1<String>(String.class);
        String[] strings = maker.create(9);
        System.out.println(Arrays.toString(strings));
    }
}
