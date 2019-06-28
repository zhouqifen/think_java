package chap15.chap15_9;

import java.awt.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 10:46
 * @Desc
 */
public class Colored2<T extends HasColor1> {
    T item;
    Colored2(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
    Color color(){
        //由于边界 允许泛型类型的参数可以调用一个非Object对象的方法
        return item.getColor();
    }
}
