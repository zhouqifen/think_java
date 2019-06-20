package chap15.chap15_4.chap15_4_6;

import java.util.EnumSet;
import java.util.Set;

import static chap15.chap15_4.chap15_4_6.Watercolor_2.*;
import static chap15.chap15_4.chap15_4_6.Sets_1.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 18:18
 * @Desc
 */
public class WatercolorSets_3 {
    public static void main(String[] args){
        EnumSet<Watercolor_2> set1 = EnumSet.range(A, E);
        EnumSet<Watercolor_2> set2 = EnumSet.range(B, F);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union(set1,set2));//并集
        Set<Watercolor_2> subet = intersection(set1, set2);//交集
        System.out.println("intersection(set1, set2)"+subet);//交集
        System.out.println("difference(set1,subet)"+difference(set1,subet));//差集 自己有而别人没有的
        System.out.println("difference(set2,subet)"+difference(set2,subet));//差集 自己有而别人没有的
        System.out.println("complement(set1,set2)"+complement(set1,set2));//补集,除开双方共有的部分
    }
}
