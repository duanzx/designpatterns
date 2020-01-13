package cn.chenhy.pattern.simpleFactory;

public class Cooker {
    public void cook(BeefNoodleType type){
        BeefNoodle beefNoodle = NoodleFactory.createNoodle(type);
        System.out.println("制作 "+beefNoodle.getName());
        beefNoodle.cook();
    }
}
