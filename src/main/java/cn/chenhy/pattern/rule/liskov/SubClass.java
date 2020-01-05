package cn.chenhy.pattern.rule.liskov;

public class SubClass extends Parent{

    @Override
    public int plus(int a,int b){
        return super.plus(a,b);
    }
    public int minus(int a,int b){
        return  a-b;
    }
}
