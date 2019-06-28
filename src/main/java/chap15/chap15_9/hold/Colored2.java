package chap15.chap15_9.hold;

import chap15.chap15_9.HasColor1;

import java.awt.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 11:26
 * @Desc
 */
public class Colored2<T extends HasColor1> extends  HoldItem1<T> {
    Colored2(T item){
        super(item);
    }
    Color color(){
        return item.getColor();
    }
}
