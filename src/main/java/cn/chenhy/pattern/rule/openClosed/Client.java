package cn.chenhy.pattern.rule.openClosed;

public class Client {
    public static void main(String[] args)throws Exception{
        Test test = new Test();
        //考试前要打印准考证
        //考后注意事项
        test.englishTest();
        test.mathTest();
        test.chineseTest();
        new EnglishTest().test();
        new MathTest().test();
    }
}
