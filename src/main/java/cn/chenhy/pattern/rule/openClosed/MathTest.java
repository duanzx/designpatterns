package cn.chenhy.pattern.rule.openClosed;

public class MathTest implements ITest {
    public void test() {
        preTest();
        System.out.println("数学考试");
        postTest();
    }

    public void preTest() {
        System.out.println("打印准考证");
    }

    public void postTest() {
        System.out.println("考后注意事项");
    }
}
