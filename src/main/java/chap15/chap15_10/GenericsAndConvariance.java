package chap15.chap15_10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 10:36
 * @Desc
 */
public class GenericsAndConvariance {
    public static void main(String[] args){
        //通配符(wildcard)允许协变量(convariance)
        List<? extends Fruit> list = new ArrayList<Apple>();
       /* list.add(new Apple());
        list.add(new Fruit());
        list.add(new Object());*/ // 编译错误不能添加任何类型的对象
        list.add(null);//这个不报错,但是没有意义
        Fruit f = list.get(0);
        System.out.println(f);


    }
}
