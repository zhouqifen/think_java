package chap15.chap15_7.chap15_7_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 10:45
 * @Desc 边界:即对象进入和离开方法的地点
 */
public class FilledListMaker_3<T> {
    List<T> create(T t, int n){
        List<T> result = new ArrayList<T>();
        for (int i = 0;i<n;i++){
            result.add(t);
        }
        return result;
    }
    public static void main(String[] args){
        FilledListMaker_3<String> stringMaker = new FilledListMaker_3<String>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }

}
