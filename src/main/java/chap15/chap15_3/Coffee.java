package chap15.chap15_3;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 10:22
 * @Desc
 */
public class Coffee {
    private static long  counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName()+ " " +id;
    }
}
