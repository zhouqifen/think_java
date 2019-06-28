package chap15.chap15_10;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 10:03
 * @Desc
 */
public class CovariantArrays {
    public static void main(String[] args){
        //数组的运行时类型是Apple[],而不是Fruit[]或者Orange[]
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();//ok
        fruit[1] = new Jonathan();//ok


        try {
            fruit[0] = new Fruit();//编译时ok,运行时报错, 因为fruit数组只能存Apple类型的元素
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            fruit[0] = new Orange();//编译时ok,运行时报错
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
