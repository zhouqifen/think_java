package chap15.chap15_7.chap15_7_3;

/**
 * @Author: zhouqifen
 * @Date:2019/6/21 17:50
 * @Desc 擦除的问题
 *
 * 1 不能显示地引用运行时类型的操作中,因为在运行时有关类型参数的所有信息的丢失了
 */
public class Foo<T> {
    T var;
}
