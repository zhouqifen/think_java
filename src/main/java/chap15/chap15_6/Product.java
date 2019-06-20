package chap15.chap15_6;

import net.mindview.util.Generator;
import sun.nio.cs.Surrogate;

import java.util.Random;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 11:17
 * @Desc
 */
public class Product {
    private final  int id;
    private String description;
    private double price;
    public Product(int IDnumber,String descr,double price){
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }
    public String toString(){
        return id + ": "+description+",price:$"+price;
    }

    public void priceChange(double change){
        price+=change;
    }

    public static Generator<Product> generator = new  Generator<Product>(){
        private Random rand = new Random(47);
        public Product next() {
            return new Product(rand.nextInt(1000),"Test",Math.round(rand.nextDouble())+1000.0 + 0.99 );
        }
    };
}
