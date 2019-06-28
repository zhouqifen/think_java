package chap15.chap15_9.hold;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 11:25
 * @Desc
 */
public class HoldItem1<T> {
    T item;
    HoldItem1(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }

}
