package cn.chenhy.pattern.rule.openClosed;

public class Test {
    public void preTest(){
        System.out.println("打印准考证");
    }
    public void postTest(){
        System.out.println("考后注意事项");
    }
    public void englishTest(){
        preTest();
        postTest();
    }
    public void mathTest(){
        preTest();
        postTest();
    }
    public void chineseTest(){
        preTest();
        postTest();
    }
}
