package chap13.chap13_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 14:30
 * @Desc
 */
public class Immutable_1 {

    public static String upcase(String s){
        return s.toUpperCase();
    }
    public static void main(String[] args){
        String q ="howdy";
        System.out.println(q);
        String qq = upcase(q);//当把q传递给方法时,实际上传递的是q引用的饿一个拷贝
        System.out.println(qq);
        System.out.println(q);
    }
}
