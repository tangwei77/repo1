package Demo02;

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
