package com.practice;

public class GHappy {
    public static void main(String[] args) throws Exception {
        String str = "gg";
        System.out.println(gHappy(str));
    }
    public static boolean gHappy(String str) {
        int len = str.length();
        if(len==0) return true;
        boolean flag = false;
        for(int i=0; i< len; i++){
            if(str.charAt(i)=='g'){
                if((i>0 && str.charAt(i-1) =='g') || (i<len-1 && str.charAt(i+1) =='g')){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
        }
        return flag;
    }

}
