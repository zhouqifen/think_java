package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 15:06
 * @Desc
 */
public class IntegerFactory6 implements  FactoryI4<Integer>{

    public Integer create() {
        return new Integer(0);
    }
}
