package chap15.chap15_4.chap15_4_6;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 17:53
 * @Desc
 */
public class Sets_1 {
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);//并集
        return result;
    }
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);//交集,双方共有的
        return result;
    }
    public static <T> Set<T> difference(Set<T> supersets,Set<T> subset){
        Set<T> result = new HashSet<T>(supersets);
        result.removeAll(subset);//差集,自己有而别人没有的
        return result;
    }

    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));//补集,除开双方共有的

    }
}
