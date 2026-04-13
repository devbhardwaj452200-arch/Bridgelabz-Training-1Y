package com.gla.framework;
import java.util.*;
public class HashMapEx {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("om",90);
        map.put("chirag",91);
        System.out.println(map);
        System.out.println(map.get("chirag"));
        System.out.println(map.get("chirag"));
        System.out.println(map.containsKey("chirag"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        for(String key:map.keySet()){
            System.out.println(key+" ");
            System.out.println(map.get(key)+" ");
        }
    }
}
