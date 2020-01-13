package cn.chenhy.pattern.simpleFactory;

public class NormalBeefNoodle extends BeefNoodle {
    private static int DEFAULT_PRICE=15;
    private static String DEFAULT_NAME = "传统牛肉面";
    public NormalBeefNoodle(){
        this.price=DEFAULT_PRICE;
        this.name = DEFAULT_NAME;
    }
    public NormalBeefNoodle(int price , String name){
        this.price=price;
        this.name = name;
    }
    public void cook() {
        System.out.println("煮面");
        System.out.println("倒入牛肉汤");
        System.out.println("放入牛肉粒");
    }
}
