package cn.chenhy.pattern.simpleFactory;

public abstract class BeefNoodle {
    protected int price;
    protected String name;
    public abstract void cook();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
