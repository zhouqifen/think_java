package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 15:07
 * @Desc
 */
public class Widget7 {
    public static  class Factory implements FactoryI4<Widget7>{
        public Widget7 create() {
            return new Widget7();
        }
    }
}
