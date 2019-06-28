package chap15.chap15_9.power;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 16:39
 * @Desc
 */
public class CanineHero<POWER extends  SuperHearing & SuperSmell> extends SuperHero<POWER> {

    CanineHero(POWER power) {
        super(power);
    }

    void hear(){
        power.hearSubtleNoises();
    }

    void smell(){
        power.trackBySmell();
    }
}
