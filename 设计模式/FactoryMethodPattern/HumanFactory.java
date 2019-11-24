package FactoryMethodPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @program: person-demo
 * @description:
 * @author: jijiang
 * @create: 2019-11-24 19:40
 **/

public class HumanFactory {
    //定义一个MAP,初始化过的Human对象都放在这里
    private static HashMap<String,Human> humans = new HashMap<String,Human>();
    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {

        Human human = null; //定义一个类型的人类

        //如果MAP中有，则直接从取出，不用初始化了
        if (humans.containsKey(c.getSimpleName())) {
            human = humans.get(c.getSimpleName());
        } else {
            try {
                human = (Human) Class.forName(c.getName()).newInstance();
                //放到MAP中
                humans.put(c.getSimpleName(), human);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }

    //女娲生气了，把一团泥巴塞到八卦炉，哎产生啥人种就啥人种
    public static Human createHuman(){
        Human human=null; //定义一个类型的人类
        //首先是获得有多少个实现类，多少个人种
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class); //定义了多少人种
//八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}

