package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 14:24
 * @Desc 针对 T t = new T();报错的解决方案
 * java中的解决方案是传递一个工厂对象,并使用它来创建新的实例,最便利的工厂对象就是Class对象
 * 因此如果使用类型标签的,那么你就可以使用newInstance()来创建这个类型的新对象
 * 内建工厂
 *
 */
public class ClassAsFactory1<T> {
    T x;
    public ClassAsFactory1(Class<T> kind) {//Class<T>就是类型标签
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
