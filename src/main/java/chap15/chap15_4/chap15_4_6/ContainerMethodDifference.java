package chap15.chap15_4.chap15_4_6;

import net.mindview.util.Sets;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 18:39
 * @Desc
 */
public class ContainerMethodDifference {

    static Set<String> methodSet(Class<?> type){//获取Class<?> 中的所有方法
        Set<String> result = new TreeSet<String>();
        for (Method m : type.getMethods()){
            result.add(m.getName());
        }
        return result;
    }
    static void  interfaces(Class<?> type){
        System.out.println("interfaces in "+type.getSimpleName()+":");
        List<String> result = new ArrayList<String>();
        for(Class<?> c:type.getInterfaces()){//Class<?>继承了哪些接口
            result.add(c.getSimpleName());
            System.out.println(result);
        }
    }

    static Set<String> object = methodSet(Object.class);
    static {
        object.add("clone");
    }

    static void difference(Class<?> superSet,Class<?> subSet){
        System.out.println(superSet.getSimpleName() +" extends "+ subSet.getSimpleName()+", adds");
        Set<String> comp = Sets.difference(methodSet(superSet),methodSet(subSet));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superSet);
    }

    public static void main(String[] args){
        System.out.println("Collection: "+methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class,Collection.class);
        difference(HashSet.class,Set.class);
        difference(LinkedHashSet.class,HashSet.class);
        difference(TreeSet.class,Set.class);
    }
}
