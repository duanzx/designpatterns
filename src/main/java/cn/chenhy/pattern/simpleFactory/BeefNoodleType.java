package cn.chenhy.pattern.simpleFactory;

public enum BeefNoodleType {
    NORMAL("Normal"), INDIVIDUAL("Individual"),SAUERKRAUT("Sauerkraut");
    private BeefNoodleType(String type){
        this.type = type;
    }
    private String type;
    public String getType(){
        return this.type;
    }
}
