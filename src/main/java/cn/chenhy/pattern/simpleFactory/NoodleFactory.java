package cn.chenhy.pattern.simpleFactory;

public class NoodleFactory {
    public static BeefNoodle createNoodle(BeefNoodleType beefNoodleType){
        if (null != beefNoodleType){
            if (beefNoodleType.getType().equals(BeefNoodleType.NORMAL.getType())){
                return new NormalBeefNoodle();
            }
            if (beefNoodleType.getType().equals(BeefNoodleType.INDIVIDUAL.getType())){
                return new IndividualBeefNoodle();
            }
            if (beefNoodleType.getType().equals(BeefNoodleType.SAUERKRAUT.getType())){
                return new SauerkrautBeefNoodle();
            }
        }
        return null;
    }
}
