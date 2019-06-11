package chap13.chap13_5.chap13_5_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/11 17:03
 * @Desc
 */
public class SimpleFormat {
    public static void main(String[] args){
        int x = 5;
        double y = 5.332542;
        // old way
        System.out.println("Row 1:["+x+" " + y + "]");
        //new way
        System.out.format("Row 1: [%d %f]\n",x,y);
        //or
        System.out.printf("Row 1: [%d %f]\n",x,y);
    }
}
