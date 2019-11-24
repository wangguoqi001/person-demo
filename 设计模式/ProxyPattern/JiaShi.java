package ProxyPattern;

/**
 * @program: person-demo
 * @description:
 * @author: jijiang
 * @create: 2019-11-24 21:09
 **/

public class JiaShi implements KindWomen{
    @Override
    public void happyWithMan() {
        System.out.println("贾氏正在Happy中......");
    }
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }
}
