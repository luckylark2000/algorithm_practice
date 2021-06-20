package 接口练习;

public class Pig implements PetRestaurant{
    public String name(){
        return "小猪";
    }
    public void buy(){
        System.out.println("小猪：我是小猪，我要买猪粮");
    }
    public void eat(){
        System.out.println("小猪：哼哼哼，我能在地上吃吗");
    }
}
