package cn.chenhy.pattern.rule.dependenceInversion;

public class Client {
    public static void main(String[] args)throws Exception{
        methodOther(new Producer());
        methodOther(new Programmer());
    }
    public static void method(Producer producer){
        producer.workScore();
    }
    public static void methodOther(Employee employee){
        employee.workScore();
    }
}
