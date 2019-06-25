package chap15.chap15_7.chap15_7_3;

/**
 * @Author: zhouqifen
 * @Date:2019/6/21 18:29
 * @Desc  使用泛型并不是强制的
 */
public class GenericBase<T> {
    private T element;
    public void set(T arg){
        arg = element;
    }

    public T get(){
        return element;
    }
    public static void main(String[] args){
        Drived2 d2 = new Drived2();
        Object o = d2.get();
        d2.set(o);

    }
}

class Drived1<T> extends GenericBase<T>{}
class Drived2 extends GenericBase{}
//class Drived3 extends GenericBase<?>{}



