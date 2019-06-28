package chap15.chap15_9.power;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 14:02
 * @Desc
 */
public class SuperHero<POWER extends  SuperPower> {
    POWER power;
    SuperHero(POWER power){
        this.power = power;
    }

    POWER getPower(){
        return  power;
    }
}
