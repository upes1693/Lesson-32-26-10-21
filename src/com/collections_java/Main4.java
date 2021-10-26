package com.collections_java;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Properties props=new Properties();
        props.put("Student A","Java Class");
        props.put("Student B","Java Class");
        props.put("Student C","C# Class");
        props.put("Student D","Python Class");
        props.put("Student D","C# Class");
//        for (Map.Entry entry : props.entrySet()) {
//            System.out.println("Key " + entry.getKey() + " value " + entry.getValue());
//        }
        Set<Object> set=props.keySet();
        for (Object obj:set) {
            System.out.println(obj+" is studying at "+props.getProperty(obj.toString()));
        }
    }
}
