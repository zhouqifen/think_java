package chap15.chap15_9.hold;

import chap15.chap15_9.Dimension3;
import chap15.chap15_9.HasColor1;
import chap15.chap15_9.Weight5;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 11:50
 * @Desc
 */
public class Solid2_4<T extends Dimension3 & HasColor1 & Weight5> extends ColoredDimension2_3<T>{


    Solid2_4(T item) {
        super(item);
    }

    int weight(){
        return item.weight();
    }
}
