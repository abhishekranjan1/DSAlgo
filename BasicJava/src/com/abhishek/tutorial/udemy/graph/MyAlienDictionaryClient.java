package com.abhishek.tutorial.udemy.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyAlienDictionaryClient {
    public static void main(String[] args){
        String[] words = {"wrt","wrf","er","ett","rftt"};
        List<MyVertex> graph= buildGraph(words);
    }

    private static List<MyVertex> buildGraph(String[] words) {
        List<MyVertex> graph = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for(String word : words){
            char[] chars = word.toCharArray();

            if(!set.contains(chars[0])){
                MyVertex v = new MyVertex(chars[0]);
                set.add(v.getData());
            }
            for(int i=1; i< chars.length; i++){
                if(!set.contains(chars[i])){

                }
            }
        }
        
        
        
        return graph;
    }


}
