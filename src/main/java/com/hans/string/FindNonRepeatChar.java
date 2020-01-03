package com.hans.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * First repeat element
 * First Non repeat element
 */
public class FindNonRepeatChar {

    public static void main(String[] args) {
        String name = "JavaWorld";
        HashSet<Character> set = new HashSet<Character>();
        char repeatChar = Character.MIN_VALUE;
        for (int i = 0;i<name.length(); i++){
            if(set.contains(name.charAt(i))){
                repeatChar = name.charAt(i);
                break;
            }else {
                set.add(name.charAt(i));
            }
        }
        System.out.println("First Repeat Char "+ repeatChar);
        char ch = findEl(name);
        System.out.println("First Non Repeat Char "+ ch);
    }

    static Character findEl(String name){
        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i= 0; i<name.length();i++){
            char el = name.charAt(i);
            if(map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            }else{
                map.put(el,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
