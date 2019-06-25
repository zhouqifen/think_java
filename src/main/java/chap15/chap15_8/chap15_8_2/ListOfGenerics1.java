package chap15.chap15_8.chap15_8_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 17:46
 * @Desc 不能创造泛型数组,一般的解决方法是在任何想要创建泛型数组的地方都使用ArrayList
 */
public class ListOfGenerics1<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item){
        array.add(item);
    }
    public T get(int index){
        return array.get(index);
    }
}
