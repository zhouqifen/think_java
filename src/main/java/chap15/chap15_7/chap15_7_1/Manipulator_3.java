package chap15.chap15_7.chap15_7_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/21 16:59
 * @Desc  泛型没有贡献好处时,自己去执行擦除
 */
public class Manipulator_3 {
    private HasF obj;
    public Manipulator_3(HasF x){
        obj = x;
    }

    public void manipulate(){
        obj.f();
    }

}
