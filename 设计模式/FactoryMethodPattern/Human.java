package FactoryMethodPattern;

public interface Human {
    //首先定义什么是人类
    //人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了；
    public void laugh();
    //人类还会哭，代表痛苦
    public void cry();
    //人类会说话
    public void talk();
}
