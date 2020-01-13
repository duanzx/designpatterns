package cn.chenhy.pattern.builder;

public class PersonBuilder {
    private Person person;
    public PersonBuilder(){
        person=new Person();
    }
    public PersonBuilder(Person person){
        this.person=person;
    }
    public PersonBuilder name(String name){
        this.person.setName(name);
        return this;
    }
    public PersonBuilder idCard(String idCard){
        this.person.setIdCard(idCard);
        return this;
    }
    public PersonBuilder email(String email){
        this.person.setEmail(email);
        return this;
    }
    public PersonBuilder mobile(String mobile){
        this.person.setMobile(mobile);
        return this;
    }
    public PersonBuilder age(int age){
        this.person.setAge(age);
        return this;
    }
    public Person build(){
        return this.person;
    }
}
