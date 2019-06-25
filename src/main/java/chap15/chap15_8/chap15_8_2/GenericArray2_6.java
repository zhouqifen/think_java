package chap15.chap15_8.chap15_8_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 18:58
 * @Desc
 */
public class GenericArray2_6<T> {
    private Object[] array;
    public GenericArray2_6(int sz){
        array = new Object[sz];
    }
    public void put(int index,T item){
        array[index] = item;
    }

    public T get(int index){
        return (T)array[index]; //这是正确的类型也是安全的
    }
    public T[] rep(){
        return (T[])array;
    }
    public static void main(String[] args){
        GenericArray2_6<Integer> gai = new GenericArray2_6<Integer>(10);
        for(int i =0;i<10;i++){
            gai.put(i,i);
        }
        for(int i =0;i<10;i++){
            Integer integer = gai.get(i);//这是正确的类型也是安全的
            System.out.print(gai.get(i) + " ");
        }

        System.out.println();

        try {
            Integer[] ia = gai.rep();//想将Object[]数组转型为T[],这仍旧是不正确的,在编译期产生警告,在运行时产生异常,因此没有任何方式可以推翻底层的数组类型
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
