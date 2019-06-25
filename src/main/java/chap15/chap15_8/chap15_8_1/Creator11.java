package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 15:24
 * @Desc
 */
public class Creator11  extends GenericWithCreate9<X10>{
    protected X10 create() {
        return new X10();
    }

    public void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
