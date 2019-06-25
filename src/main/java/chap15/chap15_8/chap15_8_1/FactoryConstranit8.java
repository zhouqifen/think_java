package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 15:09
 * @Desc
 */
public class FactoryConstranit8 {
    public static void main(String[] args){
        new Foo2_5<Integer>(new IntegerFactory6());
        new Foo2_5<Widget7>(new Widget7.Factory());
    }
}
