package FactoryMethodPattern;

/**
 * @program: person-demo
 * @description:
 * @author: jijiang
 * @create: 2019-11-24 19:33
 **/

public class YellowHuman implements Human {
    @Override
    public void cry() {
        System.out.println("黄色人种会哭");
    }

    @Override
    public void laugh() {
        System.out.println("黄色人种会大笑，幸福呀！ ");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");

    }
}