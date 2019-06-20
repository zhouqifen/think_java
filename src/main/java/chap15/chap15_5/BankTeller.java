package chap15.chap15_5;

import chap15.chap15_4.chap15_4_3.Generator_1;
import net.mindview.util.Generator;
import sun.nio.cs.Surrogate;

import java.util.*;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 10:00
 * @Desc 泛型应用于匿名内部类,  使用匿名内部类实现Generator接口
 */
public class BankTeller {
    public static void serve(Teller t,Customer c){
        System.out.println(t + " serve " + c);
    }

    public static void main(String[] args){
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generator_1.fill(line,Customer.generator(),15);//利用customer的生成器方法生成一个customer对象添加到line集合中,一共会添加15个customer对象
        List<Teller> tellers = new ArrayList<Teller>();
        Generator_1.fill(tellers,Teller.generator,4);
        for(Customer c : line){
            serve(tellers.get(rand.nextInt(tellers.size())),c);
        }
    }
}


class Customer{
    private static long counter = 1;
    private final long id = counter++;
    private Customer(){}
    public String toString(){
        return "Customer " + id;
    }

    public static Generator<Customer> generator(){//这会创建多个生成器
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }
}


class Teller{
    private static long counter = 1;
    private final long id  = counter++;
    private Teller(){}
    public String toString(){
        return "Teller " + id;
    }

    public static Generator<Teller> generator = new Generator<Teller>() {//这只会创建一个生成器
        public Teller next() {
            return new Teller();
        }
    };
}



