package ProxyPattern;

/**
 * @program: person-demo
 * @description:
 * @author: jijiang
 * @create: 2019-11-24 20:45
 **/

public class XiMenQing {
    public static void main(String[] args) {
        //把王婆叫出来
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo = new WangPo(jiaShi);
        //然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
        wangPo.makeEyesWithMan(); //看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
        wangPo.happyWithMan();
    }
}
