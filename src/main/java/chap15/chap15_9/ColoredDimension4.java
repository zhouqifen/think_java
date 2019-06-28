package chap15.chap15_9;

import java.awt.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 10:52
 * @Desc
 */
public class ColoredDimension4<T extends Dimension3 & HasColor1> {
    T item;
    ColoredDimension4(T item){
        this.item = item;
    }
    Color color(){
        return item.getColor();
    }
    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }

}
