package chap15.chap15_8.chap15_8_1;

/**
 * @Author: zhouqifen
 * @Date:2019/6/25 15:21
 * @Desc 模板方法设计模式
 */
public  abstract  class GenericWithCreate9<T> {
    final T element;
    public GenericWithCreate9(){
        element = create();
    }

    protected abstract T create();


}
