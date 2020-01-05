package cn.chenhy.pattern.rule.liskov;

public class Client {
    public static void main(String[] args)throws Exception{
        p(2,3);
    }
    public static void p(int a,int b){
        System.out.println(new SubClass().plus(a,b));
    }
}
