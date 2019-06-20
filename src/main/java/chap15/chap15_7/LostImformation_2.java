package chap15.chap15_7;

import java.util.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 18:22
 * @Desc
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