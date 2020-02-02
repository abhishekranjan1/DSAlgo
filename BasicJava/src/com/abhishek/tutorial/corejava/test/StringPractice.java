package com.abhishek.tutorial.corejava.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringPractice {

    public static void main(String[] args){
//        String s = "Hi My name, is Abhishek Ranjan";
//        String modified = s.replaceAll("[^A-Za-z]"," ");
//        System.out.println(modified);


//        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String paragraph ="BoB, HiT, BALL";
                String[] arr = {"bob","hit"};
        System.out.println(mostCommonWord(paragraph, arr));

    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>();
        for(String s: banned){
            bannedWords.add(s);
        }

        Map<String, Integer> map = new HashMap<>();
        String[] modified = paragraph.replaceAll("[^A-Za-z]"," ").toLowerCase().split(" ");
//        for(String s: modified){
//            System.out.println(s);
//        }
        for(String word: modified ){
            if(!bannedWords.contains(word))
                map.put(word, map.getOrDefault(word,0)+1);
        }

        System.out.println(map);

        String result ="";
        int max=Integer.MIN_VALUE;
        for(String key: map.keySet()){

            if(key.equals("")){
                continue;
            }

            if(max < map.get(key)){
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }
}
