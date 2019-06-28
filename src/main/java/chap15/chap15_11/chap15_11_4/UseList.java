package chap15.chap15_11.chap15_11_4;

import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 17:56
 * @Desc 由于擦除的原因 ,重载方法将产生相同的类型签名
 */
public class UseList<W,T> {
    void f(List<T> v){}
   // void f(List<W> v){}
}
