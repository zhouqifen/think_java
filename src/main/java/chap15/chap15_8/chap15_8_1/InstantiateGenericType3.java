package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 14:29
 * @Desc
 */
public class InstantiateGenericType3 {
    public static void main(String[] args){
        ClassAsFactory1<Employee2> fe = new ClassAsFactory1<Employee2>(Employee2.class);
        System.out.println("ClassAsFactory1<Employee2> succeded");
        try {
            //这会报错 因为Integer没有默认的构造器,  这个错误也不是在编译期能捕获的,只能在运行时报错 ,所以java的设计者们不赞成这种方式
            ClassAsFactory1<Integer> fi = new ClassAsFactory1<Integer>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory1<Integer> failed");
        }
    }
}
