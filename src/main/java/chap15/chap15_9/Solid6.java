package chap15.chap15_9;

import java.awt.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 10:57
 * @Desc
 */
public class Solid6<T extends  Dimension3 & HasColor1 & Weight5> {
    T item;
    Solid6(T item){
        this.item = item;
    }

    T getItem(){
        return item;
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

    int weight(){
        return item.weight();
    }

}
