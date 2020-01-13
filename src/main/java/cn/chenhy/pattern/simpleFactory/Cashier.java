package cn.chenhy.pattern.simpleFactory;

public class Cashier {
    public void cash(BeefNoodleType type){
        BeefNoodle beefNoodle = NoodleFactory.createNoodle(type);
        System.out.println("收取 "+beefNoodle.getName()+" 价格："+beefNoodle.getPrice());
    }
}
