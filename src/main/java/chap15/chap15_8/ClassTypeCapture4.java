package chap15.chap15_8;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 11:46
 * @Desc
 */
public class ClassTypeCapture4<T> {
    Class<T> kind;
    public ClassTypeCapture4(Class<T> kind){
        this.kind = kind;
    }
    //如果引入类型标签,就可以转而使用动态的isInstance
    public boolean f(Object arg){
        return kind.isInstance(arg);
    }
    public static void main(String[] args){
        //通过类型标签来对擦除进行补偿,这意味着你需要显示的传递你的类型的Class对象,以便你再类型表达式中使用它
        ClassTypeCapture4<Building2> ctt1 = new ClassTypeCapture4<Building2>(Building2.class);
        System.out.println(ctt1.f(new Building2()));
        System.out.println(ctt1.f(new House3()));

        ClassTypeCapture4<House3> ctt2 = new ClassTypeCapture4<House3>(House3.class);
        System.out.println(ctt2.f(new Building2()));
        System.out.println(ctt2.f(new House3()));
    }
}
