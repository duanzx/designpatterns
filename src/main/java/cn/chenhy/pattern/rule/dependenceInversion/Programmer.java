package cn.chenhy.pattern.rule.dependenceInversion;

public class Programmer extends Employee {
    void work() {
        System.out.println("programmer work");
    }

    void workScore() {
        System.out.println("programmer work score");
    }

    String name() {
        return "programmer";
    }
}
