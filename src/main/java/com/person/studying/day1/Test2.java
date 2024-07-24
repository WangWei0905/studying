package com.person.studying.day1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author mr.wang
 * @Date 2024/7/23 9:06 上午
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        boolean abcdad = match("t1 t4 t533 t8 t1 t8", "ABCDAD");
        System.out.println(abcdad);
    }
    public static boolean match(String key, String pattern){
        String[] words = key.split(" ");
        if(words.length != pattern.length()){
            return false;
        }

        Map<Character, String> h1 = new HashMap<>();

        Map<String, Character> h2 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if(h1.containsKey(c)){
                if(!h1.get(c).equals(word)){
                    return false;
                }
            } else {
                if(h2.containsKey(word)){
                    if(h2.get(word).equals(c)){
                        return false;
                    }
                } else {
                    h1.put(c, word);
                    h2.put(word,c);
                }
            }
        }
        return true;
    }
}
