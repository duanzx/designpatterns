package cn.chenhy.pattern.simpleFactory;

public class IndividualBeefNoodle extends BeefNoodle {
    private static int DEFAULT_PRICE=18;
    private static String DEFAULT_NAME = "招牌牛肉面";
    public IndividualBeefNoodle(){
        this.price=DEFAULT_PRICE;
        this.name = DEFAULT_NAME;
    }
    public IndividualBeefNoodle(int price , String name){
        this.price=price;
        this.name = name;
    }
    public void cook() {
        System.out.println("煮面");
        System.out.println("倒入牛肉汤");
        System.out.println("放入牛肉片");
    }
}
