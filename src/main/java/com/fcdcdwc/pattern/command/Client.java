package com.fcdcdwc.pattern.command;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fcdcdwc
 */
public class Client {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("小杯可乐", 2);

        //创建第二个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝盖饭", 1);
        order2.setFood("小杯雪碧", 1);

        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);

        //创建调用者（服务员对象）
        Waitor invoke = new Waitor();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);

        int tongxue = 31500;
        int jiali = 160000;
        int majie = 30000;
        int yuying = 50000;
        int jiezong = tongxue + jiali + majie + yuying;

        int jianshe = 37000 - 6700;
        int jiaotong = 20000 - 9300;
        int gongshang = 25000 - 7900;
        int meituan = 38000 - 23000;
        int xinzong = jianshe + jiaotong + gongshang + meituan;

        int duxiaoman = 164000;
        int wangshangdai = 139700 - 85700;
        int huabei = 45200 - 23100;
        int jingdong = 18000 - 13000;
        int daizong = duxiaoman + wangshangdai + huabei + jingdong;

        int zong = jiezong + xinzong + daizong;
        System.out.println("家：" + jiezong);
        System.out.println("信：" + xinzong);
        System.out.println("贷：" + daizong);
        System.out.println("欠总：" + zong);

        int fangdai = 2700 * 60;
        int chedai = 3061 * 47;
        int baoxian = 1500 * 60;
        int you = 4 * 32000;
        int che = 15000 * 5;
        int gongsi = 3500 * 5;
        int sheng = 3000 * 60;
        int guzong = fangdai + chedai + baoxian + you + che + gongsi + sheng;
        System.out.println("支出型总：" + guzong);

        System.out.println("总：" + (guzong + zong));


        //让服务员发起命令
//        invoke.orderUp();
    }
}
