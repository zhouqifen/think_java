package chap13.chap13_2;

import java.util.Random;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 15:39
 * @Desc
 */
public class UsingStringBuilder_3 {
    public static Random rand = new Random(47);
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for(int i= 0; i<25;i++){
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2,result.length());//删除最后一个逗号和空格
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args){
        UsingStringBuilder_3 usb = new UsingStringBuilder_3();
        System.out.print(usb);
    }
}
