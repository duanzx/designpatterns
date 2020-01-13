package cn.chenhy.pattern.builder;

public class Person {
    private String name;
    private String idCard;
    private String email;
    private String mobile;
    private int age;
    public Person(){
    }
    public Person(String name){}//String idCard ?
    public Person(String name,String idCard){ //String email,String mobile
        this.name=name;
        this.idCard=idCard;
    }//String email,String mobile ?
    public Person(String name,String idCard,String email){
        this.name=name;
        this.idCard=idCard;
        this.email=email;
    }
    public Person(String name,String idCard,String email,String mobile){
        this.name=name;
        this.idCard=idCard;
        this.email=email;
        this.mobile=mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
