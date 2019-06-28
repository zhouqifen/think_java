package chap15.chap15_11.chap15_11_3;

import chap15.chap15_8.chap15_8_1.Widget7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 16:48
 * @Desc
 */
public class NeedCasting {
    public void f(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        List<Widget7> shapes = ( List<Widget7> )in.readObject();
    }
}
