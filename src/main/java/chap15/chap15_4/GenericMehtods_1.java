package chap15.chap15_4;

/**
 * @Author: zhouqifen
 * @Date:2019/6/19 16:15
 * @Desc 学习泛型方法 只需将泛型参数至于返回值之前
 */
public class GenericMehtods_1 {
    public <T> void  f(T x){//f方法的类型参数是由返回值前面的类型参数指明的
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args){
        GenericMehtods_1 gm = new GenericMehtods_1();
        //当使用泛型类时,必须在创建类的时候指定类型参数的值,
        // 而使用泛型方法的时候,通常不必指明参数类型,因为编译器会为我们找出具体的参数类型 称为类型参数推断
        gm.f(" ");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0f);
        gm.f('C');
        gm.f(gm);
    }
}
