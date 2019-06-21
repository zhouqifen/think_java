package chap15.chap15_7;

import java.util.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 18:22
 * @Desc 在泛型代码内部无法获得任何有关泛型参数类型的信息 只能通过getClass().getTypeParameters()方法获得类型参数测标识符
 *
 * 可以知道类型参数标识符  和 泛型类型边界  但无法知道用来创建特定实例的实际类型参数   因为具体的类型信息被擦除了,唯一知道的就是在使用一个对象
 *
 * 例如 List<String> 和 List<Integer>在运行时是相同的类型 都被擦除成他们的原生类型List
 *
 * 什么叫擦除:
 * 在泛型代码内部,无法获得任何有关类型参数的信息,在运行时,都被还原成它的原生类型
 */
public class LostImformation_2 {
    public static void main(String[] args){
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Particle<Long, Double> p = new Particle<Long, Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));//getTypeParameters方法是获得定义该类时,该类上带的类型参数的标识符
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));

    }
}
class Frob{}
class Fnorkle{}
class  Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}