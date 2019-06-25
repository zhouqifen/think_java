package chap15.chap15_7.chap15_7_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 10:35
 * @Desc
 */
public class ListMaker_2<T> {
    List<T> create(){
        return new ArrayList<T>();
    }
    public static void main(String[] args){
        ListMaker_2<String> stringListMaker_2 = new ListMaker_2<String>();
        List<String> strings = stringListMaker_2.create();
        System.out.println(strings);
    }

}
