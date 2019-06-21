package chap15.chap15_7.chap15_7_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/21 16:59
 * @Desc 用extends 给定泛型类的边界  类型参数T将擦除到图的第一个边界
 * 编译器实际上会类型参数替换为它的擦除,比如把 T替换为HasF
 */
public class Manipulator_2<T extends  HasF> {
    private T obj;
    public Manipulator_2(T x){
        obj = x;
    }

    public void manipulate(){
        obj.f();
    }

}
