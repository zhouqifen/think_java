package chap15.chap15_7.chap15_7_4;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 10:56
 * @Desc
 */
public class SimpleHolder_4 {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args){
        SimpleHolder_4 holder = new SimpleHolder_4();
        holder.setObject("Item");
        String s = (String)holder.getObject();
        System.out.println(s);
    }
}
