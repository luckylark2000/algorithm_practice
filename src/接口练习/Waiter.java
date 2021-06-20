package 接口练习;

import org.jetbrains.annotations.NotNull;

public class Waiter {
    //服务员的服务函数，PetRestaurant是接口名字
    public void service(@NotNull PetRestaurant pet){
        pet.buy();//buy()方法是接口里的方法.只要pet来了他就要买东西
        System.out.println("服务员：欢迎光临"+pet.name()+",这是你的食物");
        pet.eat();
        System.out.println("服务员：当然可以");
    }
}

