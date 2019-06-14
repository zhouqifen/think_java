package chap15.chap15_2;

/**
 * @Author: zhouqifen
 * @Date:2019/6/12 14:14
 * @Desc
 */
public class Holder_1 {
    private AutoMobile autoMobile;
    public Holder_1(AutoMobile autoMobile){
        this.autoMobile=autoMobile;
    }

    public AutoMobile getAutoMobile() {
        return autoMobile;
    }

    public void setAutoMobile(AutoMobile autoMobile) {
        this.autoMobile = autoMobile;
    }
}

class AutoMobile{}
