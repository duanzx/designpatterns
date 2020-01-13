package cn.chenhy.pattern.simpleFactory;

public class SauerkrautBeefNoodle extends BeefNoodle {
    private static int DEFAULT_PRICE=16;
    private static String DEFAULT_NAME = "酸菜牛肉面";
    public SauerkrautBeefNoodle(){
        this.price=DEFAULT_PRICE;
        this.name = DEFAULT_NAME;
    }
    public SauerkrautBeefNoodle(int price , String name){
        this.price=price;
        this.name = name;
    }
    public void cook() {
        System.out.println("煮面");
        System.out.println("倒入牛肉汤");
        System.out.println("放入牛肉粒");
        System.out.println("放入酸菜");
    }
}
