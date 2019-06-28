package chap15.chap15_10.chap15_10_3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 14:58
 * @Desc
 */
public class UnboundedWildCards2 {
    static Map map1;
    static Map<?,?> map2;
    static Map<String,?> map3;
    static void assign1(Map map){
        map1 = map;

    }

    static void assign2(Map<?,?> map){
        map2 = map;
    }

    static void assign3(Map<String,?> map){
        map3 = map;
    }

    public static void main(String[] args){
        assign1(new HashMap());
        assign2(new HashMap());
        assign3(new HashMap());

        assign1(new HashMap<String,Integer>());
        assign2(new HashMap<String,Integer>());
        assign3(new HashMap<String,Integer>());


    }

}
