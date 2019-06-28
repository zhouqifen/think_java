package chap15.chap15_11.chap15_11_3;

import chap15.chap15_8.chap15_8_1.Widget7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import static sun.management.GcInfoCompositeData.cast;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 16:52
 * @Desc
 */
public class ClassCasting {
    public void f(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        //List<Widget7>  lw1 = List<Widget7>.class.cast(in.readObject());
        List<Widget7> cast = (List<Widget7>)List.class.cast(in.readObject());


    }
}
