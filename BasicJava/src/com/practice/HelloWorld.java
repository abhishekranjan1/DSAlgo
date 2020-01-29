package com.practice;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
    public static void main(String []args){
        boolean flag1=true;
        boolean flag2=true;
        boolean flag3=false;
        // System.out.println(flag1||flag3);
        List<Integer> ls = new ArrayList<>();
        int i=2;
        int j=3;
        ls.add(2);
        ls.add(3);
        System.out.println(ls);
        ls.clear();
        System.out.println(ls);
    }
}
