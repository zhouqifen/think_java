package chap15.chap15_2.chap15_2_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/20 10:57
 * @Desc
 */
public class TupbleTest {
    public static TwoTuple<String,Integer> f(){
        return new TwoTuple<String, Integer>("hi",47);
    }
    public static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(),"hi",47);
    }

    public  static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(),new Amphibian(),"hi",47);
    }

    public  static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(),new Amphibian(),"hi",47,11.1);
    }
    public static void main(String[] args){
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }


}

