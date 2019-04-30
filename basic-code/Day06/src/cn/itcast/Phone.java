package cn.itcast;

public class Phone {
   private String brand;
   private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(){
        System.out.println("正在使用价格为"+this.price+"元的"+this.brand+"品牌的手机打电话");
    }

    public void sendessage(){
        System.out.println("正在使用价格为"+this.price+"元的"+this.brand+"品牌的手机发短信");
    }

    public void playGame(){
        System.out.println("正在使用价格为"+this.price+"元的"+this.brand+"品牌的手机玩游戏");
    }
}
