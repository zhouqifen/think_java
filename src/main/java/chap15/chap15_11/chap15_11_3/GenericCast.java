package chap15.chap15_11.chap15_11_3;

/**
 * @Author: zhouqifen
 * @Date:2019/6/28 16:30
 * @Desc
 */
public class GenericCast {
    public static final int SIZE = 10;
    public static void main(String[] args){
        FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);
        for(String s :"A B C D E F G H I J".split(" ")){
            strings.push(s);
        }

        for(int i= 0; i<SIZE;i++) {
            String s = strings.pop();
            System.out.println(s.getClass().getSimpleName());
            System.out.println(s + " ");
        }
    }
}
