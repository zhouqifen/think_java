package chap15.chap15_7.chap15_7_4;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 11:00
 * @Desc
 */
public class GenericHolder_5<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public static void main(String[] args){
        GenericHolder_5<String> holder = new GenericHolder_5<String>();
        holder.setObj("Item");
        String obj = holder.getObj();
        System.out.println(obj);
    }
}
