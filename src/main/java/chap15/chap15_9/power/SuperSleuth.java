package chap15.chap15_9.power;

/**
 * @Author: zhouqifen
 * @Date:2019/6/26 14:05
 * @Desc
 */
public class SuperSleuth<POWER extends  XRayVision>  extends  SuperHero<POWER>{


    SuperSleuth(POWER power) {
        super(power);
    }
    void see(){
        power.seeThroughWalls();
    }
}
