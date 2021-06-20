package 接口练习;

public class Cat implements PetRestaurant{
    public String name(){
        return "小猫";
    }
    public void buy(){
        System.out.println("小猫：我是小猫，我要买猫粮");
    }
    public void eat(){
        System.out.println("小猫：喵喵喵，我能在桌子上吃吗？");
    }
}
