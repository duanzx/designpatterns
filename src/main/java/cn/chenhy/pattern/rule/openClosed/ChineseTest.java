package cn.chenhy.pattern.rule.openClosed;

public class ChineseTest implements ITest {
    public void test() {
        preTest();
        System.out.println("语文考试");
        postTest();
    }

    public void preTest() {
        System.out.println("打印准考证");
    }

    public void postTest() {
        System.out.println("考后注意事项");
    }
}
