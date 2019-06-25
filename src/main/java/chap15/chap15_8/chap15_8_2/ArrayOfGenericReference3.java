package chap15.chap15_8.chap15_8_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 17:51
 * @Desc
 */
public class ArrayOfGenericReference3 {
    static Generic2<Integer> [] gia;//可以按照编译器的喜欢的方式来定义一个引用, 编译器能接受这个程序,也不会产生任何警告信息
    //static Generic2<Integer> [] gis = new Generic2<Integer>[1000];//但是永远不能创建这个确切类型的数组,这个程序会报错

}
