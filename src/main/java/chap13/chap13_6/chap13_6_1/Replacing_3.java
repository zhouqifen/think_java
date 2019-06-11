package chap13.chap13_6.chap13_6_1;

/**
 * @Author: zhouqifen
 * @Date:2019/5/28 11:33
 * @Desc
 */
public class Replacing_3 {
    static String s = Splitting_2.knight;
    public static void main(String[] args){
        //将f打头的字符串替换成located
        System.out.println(s.replaceFirst("f\\w+","located"));
        //用banana替换前面的任意一个
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
