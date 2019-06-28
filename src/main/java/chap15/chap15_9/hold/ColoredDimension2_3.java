package chap15.chap15_9.hold;

import chap15.chap15_9.Dimension3;
import chap15.chap15_9.HasColor1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 11:46
 * @Desc
 */
public class ColoredDimension2_3<T extends Dimension3 & HasColor1> extends Colored2<T>{


    ColoredDimension2_3(T item) {
        super(item);
    }

    int getX(){
        return  item.x;
    }

    int getY(){
        return item.y;
    }

    int getZ(){
        return item.z;

    }
}
