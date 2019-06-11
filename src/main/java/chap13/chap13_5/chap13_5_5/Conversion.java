package chap13.chap13_5.chap13_5_5;

import java.util.Formatter;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 17:45
 * @Desc
 */
public class Conversion {
    public static void main(String[] args){
        Formatter f = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s\n",u);
        //f.format("d: %d\n",u);
        f.format("c: %c\n",u);
        f.format("b: %b\n",u);
        f.format("h: %h\n",u);
    }
}
