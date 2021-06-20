package 接口练习;

public class Test {
    public static void main(String[] args){

        PetRestaurant cat=new Cat();
        PetRestaurant dog=new Dog();
        PetRestaurant pig=new Pig();
        /*
        PetRestaurant 是接口可以定义所有实现PetRestaurant这个接口的类的对象
        PetRestaurant pig=new Integer(5) ;
        */
        Waiter waiter=new Waiter();//实例化一个服务员
        waiter.service(cat);//服务员为前来的Pet服务，service方法的实参类型为接口PetRestaurant
        waiter.service(dog);
        waiter.service(pig);
    }
}
/* 店里来了两个办过卡的宠物，小猫和小狗
* 服务员来给他们服务
* 服务员知道一切服务的流程：辨别他们的身份，再根据他们的身份提供相应的服务*/
