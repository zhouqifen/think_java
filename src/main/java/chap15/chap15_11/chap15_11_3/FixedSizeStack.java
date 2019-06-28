package chap15.chap15_11.chap15_11_3;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 16:26
 * @Desc
 */
public class FixedSizeStack<T> {
    private int index=0;
    private Object[] storage;
    public FixedSizeStack(int size){
        storage = new Object[size];

    }

    public void push(T item){
        storage[index++] = item;//将泛型类型参数存为Object
    }

    public T pop(){
        return (T)storage[--index];//将存入storage数组的Object强转成T
    }

}
