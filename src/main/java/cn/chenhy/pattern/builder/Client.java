package cn.chenhy.pattern.builder;

public class Client {

    public static void main(String[] args)throws Exception{
        Person person = new PersonBuilder().name("小明")
                .idCard("213232").email("22312@qq.com")
                .mobile("18128388294").build();
    }

    public static void main1(String[] args)throws Exception{
        new Person("小明","213232","22312@qq.com","18128388294");
        new Person("22312@qq.com","18128388294","小明","213232");
        //与其使用有参构造函数创建对象，还不如逐个对成员变量赋值
        Person person = new Person();
        person.setName("小明");
        person.setIdCard("213232");
        person.setEmail("22312@qq.com");
        person.setMobile("18128388294");
    }
}
