package chap15.chap15_2.chap15_2_3;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 18:38
 * @Desc
 */
public class RandomList<T> {
    private ArrayList<T>  storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args){
        RandomList<String> rs = new RandomList<String>();
        for(String s :("The quick brewn fox jumped over the lazy brown dog").split(" ")){
            rs.add(s);
        }
        for(int i =0;i<11;i++){
            System.out.println(rs.select() + " ");
        }
         for(int i=0;i<100;i++){
             Random random = new Random(100);
             int j= random.nextInt(21);
             System.out.println(j);
         }

    }
}
