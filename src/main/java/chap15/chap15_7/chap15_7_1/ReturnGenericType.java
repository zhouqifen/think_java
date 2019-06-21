package chap15.chap15_7.chap15_7_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/21 17:15
 * @Desc 当希望代码能跨多个类工作时,使用泛型才会有所帮助
 * 类型参数在有用的泛型代码中应用比简单的类替换要更复杂
 */
public class ReturnGenericType<T> {
    private T obj;
    public ReturnGenericType(T x){
        obj = x;
    }
    public  T get(){
        return obj;
    }
}
