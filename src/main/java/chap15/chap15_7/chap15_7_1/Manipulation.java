package chap15.chap15_7.chap15_7_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/21 17:01
 * @Desc
 */
public class Manipulation {
    public static void main(String[] args){
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();

    }
}
