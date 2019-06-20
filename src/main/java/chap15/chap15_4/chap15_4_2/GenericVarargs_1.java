package chap15.chap15_4.chap15_4_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 16:42
 * @Desc
 */
public class GenericVarargs_1 {
    public static <T> List<T> makeList(T...args){
        List<T> result = new ArrayList<T>();
        for(T item:args){
            result.add(item);
        }
        return result;
    }
    public static void main(String[] args){
        List<String> ls = makeList("A");
        System.out.println(ls);
         ls = makeList("A", "B", "C");
         System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMNOPKRSTUVWXYZ".split(""));
        System.out.println(ls);


    }
}
