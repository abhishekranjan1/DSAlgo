package com.abhishek.tutorial.aliendictionary;

import java.util.Arrays;

public class AlienDictionaryEasy {

     static boolean isAlienSorted(String[] words, String order) {

        if(words.length <=1) return true;
        int[] dict = new int[26];

        //Build the dictionary
        buildDictionary(dict, order);

        //Iterate through the words and check if they are in order or not, so compare themone by one
        for(int i=1; i< words.length; i++){
            if(!compareWords(words[i-1],words[i], dict)) return false;
        }
        return true;

    }

    static void buildDictionary(int[] dict, String order){
        for(int i=0; i< order.length();i++){
            char ch = order.charAt(i);
            dict[ch-'a']=i;
        }
    }

    static boolean compareWords(String one, String two, int[] dict){
        boolean isSame = false;
        for(int i=0; i< one.length() && i< two.length(); i++){
            char ch1 = one.charAt(i);
            char ch2 = two.charAt(i);
            if(ch1!=ch2) {
                isSame = false;
                if(dict[ch2-'a'] -dict[ch1-'a'] > 0) return true;
                else return false;
            }
            isSame = true;
        }
        if(isSame){
            if(one.length() > two.length()) return false;
        }
        return true;

    }

        public static void main(String[] args){
            String order ="worldabcefghijkmnpqstuvxyz";
            String[] words ={"word","world","row"} ;
            System.out.println(isAlienSorted(words,order));
        }


}
