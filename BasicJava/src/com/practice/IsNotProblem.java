package com.practice;

public class IsNotProblem {
    public static void main(String[] args) throws Exception {
        String str = "This is notnot";
        System.out.println(equalIsNot(str));
    }
    public static boolean equalIsNot(String str) {
        int count =0;
        int len= str.length();
        int i;
        for(i=0; i < len-3; i++){
            if(str.substring(i,i+3).equalsIgnoreCase("not")){
                count++;
                i = i+3;
            }
            if(str.substring(i,i+2).equalsIgnoreCase("is")){
                count--;
                i=i+2;
            }
        }

        String sub = str.substring(i);
        if(sub.equalsIgnoreCase("not")){
            count++;
        }
        if(sub.indexOf("is")!=-1){
            count--;
        }
        return (count == 0? true: false);

    }
}
