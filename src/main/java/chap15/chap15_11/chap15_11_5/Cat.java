package chap15.chap15_11.chap15_11_5;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 18:09
 * @Desc 被基类劫持了接口
 */
public class Cat extends ComparablePet /*implements Comparable<Cat>*/ {
    public int compareTo(Cat o) {
        return 0;
    }
}
