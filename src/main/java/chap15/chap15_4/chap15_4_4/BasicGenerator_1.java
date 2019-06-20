package chap15.chap15_4.chap15_4_4;

import chap15.chap15_3.Coffee;
import net.mindview.util.Generator;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 17:03
 * @Desc 类的通用生成器
 */
public class BasicGenerator_1<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator_1(Class<T> type){
        this.type = type;
    }
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return  new BasicGenerator_1<T>(type);
    }

    public static void main(String[] args){
       /* Coffee next = BasicGenerator_1.create(Coffee.class).next();
        System.out.println(next);*/
        Generator<Coffee> co = BasicGenerator_1.create(Coffee.class);
        for(int i = 0; i<15; i++){
            System.out.println(co.next());
        }
    }

}
