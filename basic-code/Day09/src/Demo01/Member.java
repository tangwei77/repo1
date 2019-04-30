package Demo01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int leftMoney) {
        super(name, leftMoney);
    }

    public void receive(ArrayList<Integer>list){
        // 从多个红包当中随便抽取一个，给我自己
        // 随机获取一个集合当中的索引
        int index=new Random().nextInt(list.size());

        // 根据索引，从集合当中删除，并且得到被删除的红包给我自己
        int delta = list.remove(index);

        // 当前成员自己本来有多少钱
        int money =super.getLeftMoney();

        // 加法，重新设置回去
        super.setLeftMoney(money+delta);
    }
}
