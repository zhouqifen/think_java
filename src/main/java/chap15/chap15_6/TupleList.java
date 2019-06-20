package chap15.chap15_6;

import chap15.chap15_2.chap15_2_1.Amphibian;
import chap15.chap15_2.chap15_2_1.FourTuple;
import chap15.chap15_2.chap15_2_1.TupbleTest;
import chap15.chap15_2.chap15_2_1.Vehicle;
import chap15.chap15_3.Coffee;
import chap15.chap15_5.BankTeller;
import java.util.ArrayList;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 10:34
 * @Desc 泛型可以简单而安全地创建复杂的模型
 */
public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args){
        TupleList<Vehicle, Amphibian, String, Integer> t1 = new TupleList<Vehicle, Amphibian, String, Integer>();
        t1.add(TupbleTest.h());
        t1.add(TupbleTest.h());
        for(FourTuple<Vehicle,Amphibian,String,Integer> i : t1){
            System.out.println(i);
        }


    }


}
