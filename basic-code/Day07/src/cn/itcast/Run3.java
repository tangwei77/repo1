package cn.itcast;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Run3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.println(list.get(i)+"}");
            }else{
                System.out.print(list.get(i)+"@");
            }
        }
    }
}
