package chap13.chap13_6.chap13_6_1;

/**
 * @Author: zhouqifen
 * @Date:2019/5/28 10:28
 * @Desc 13.6.1基础
 */
public class IntegrMatch_1 {

    /*
      “？”：表示0个或者1个前面的字符（扩展）
     */
    public static void main(String[] args){
         System.out.println("-1234".matches("-?\\d+"));
         System.out.println("5678".matches("-?\\d+"));
         System.out.println("+911".matches("-?\\d+"));
         System.out.println("+911".matches("(-|\\+?)\\d+"));
    }
}
