package com.hans.string;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String name ="JavaWorld";
        System.out.println("-------Duplicate-------------");
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i<name.length();i++){
            char c = name.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        for(Character ch : map.keySet()){
            if(map.get(ch) > 1)
            System.out.println(ch);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                System.out.println("Dip "+entry.getKey());
        }
    }
}
