package cn.chenhy.pattern.rule.dependenceInversion;

public abstract class Employee {
    abstract void work();
    abstract void workScore();
    abstract String name();
    public void award(){
       this.work();
       this.workScore();
       System.out.println("award "+this.name());
    }
}
