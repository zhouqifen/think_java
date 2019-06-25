package chap15.chap15_8.chap15_8_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 18:07
 * @Desc
 */
public class ArrayOfGeneric4 {
    static final int SIZE = 100;
    static Generic2<Integer>[] gia;
    public static void main(String[] args){
       // gia = (Generic2<Integer>[])new Object[SIZE];//编译时不会报错,创建了一个Object数组,但运行时会报错,类型转换异常
        //gia = new Generic2<Integer>[SIZE];//会报错 不能创建一个确切类型的数组
        //成功创建泛型数组的唯一方式是创建一个擦除类型的新数组,然后对其进行转型
        gia =(Generic2<Integer>[])new Generic2[SIZE];//不会报错,但运行时类型是原生的类型,即Generic2[]  而不是 Generic2<Integer>[]
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic2<Integer>();//不会报错 但运行时类型是 Generic2 而不是 Generic2<Integer>
        System.out.println(gia[0].getClass().getSimpleName());
       // gia[1] = new Object(); //编译时异常
        //gia[2] = new Generic2<Double>(); 编译时异常,类型不匹配异常
    }
}
