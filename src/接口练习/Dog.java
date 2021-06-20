package 接口练习;

public class Dog implements PetRestaurant {
    public String name(){
        return "小狗";
    }
    public void buy(){
        System.out.println("小狗：我是小狗，我要买狗粮");
    }
    public void eat(){
        System.out.println("小狗：汪汪汪，我能在板凳上吃吗？");
    }

}
