package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 14:57
 * @Desc 使用显示工厂 并限制其类型,使得只能接受实现了这个工厂的类
 *
 * 创建显示工厂,获得 了编译期检查的
 */
public class Foo2_5<T> {
    private T x;
    public <F extends  FactoryI4<T>> Foo2_5(F factory){
         x = factory.create();
    }
}
