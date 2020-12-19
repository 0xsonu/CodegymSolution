package java_syntex.level_5.task0517;

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name)
    {
        this.name= name;
        this.age= 5;
        this.weight= 20;
        this.color= "black";
    }
    public Cat(String name,int weight, int age)
    {
        this.name= name;
        this.age= age;
        this.weight= weight;
        this.color= "green";
    }
    public Cat(String name, int age)
    {
        this.name= name;
        this.age= age;
        this.weight= 50;
        this.color= "pink";
    }
    public Cat(int weight,String color)
    {
        // this.name= name;
        this.age= 6;
        this.weight= weight;
        this.color= color;
    }
    public Cat(int weight, String color, String address)
    {
        this.address= address;
        this.age= 9;
        this.weight= weight;
        this.color= color;
    }
    //write your code here

    public static void main(String[] args) {

    }
}
