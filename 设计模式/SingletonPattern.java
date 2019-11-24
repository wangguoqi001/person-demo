/**
 * @program: person-demo
 * @description: 单例模式
 * @author: jijiang
 * @create: 2019-11-24 19:15
 **/

public class SingletonPattern {
    private static final SingletonPattern singletonPattern= new SingletonPattern();
    //限制住不能直接产生一个实例
    private SingletonPattern(){
    }
    public synchronized static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
