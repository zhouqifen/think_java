package chap15.chap15_9.power;

import java.util.List;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 16:49
 * @Desc
 */
public class EpicBattle {

    static <POWER extends  SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
    }

    static <POWER extends  SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args){
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
        List<? extends SuperHearing> audioBoys;//这个是可行的
        //List<? extends SuperHearing & SuperHero> audioBoys; 这个会报错

    }
}
