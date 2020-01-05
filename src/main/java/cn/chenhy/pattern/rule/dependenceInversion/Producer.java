package cn.chenhy.pattern.rule.dependenceInversion;

public class Producer extends Employee {
    void work() {
        System.out.println("producer work");
    }

    void workScore() {
        System.out.println("producer work score");
    }

    String name() {
        return "producer";
    }
}
