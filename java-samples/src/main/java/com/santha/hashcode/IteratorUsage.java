package com.santha.hashcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorUsage {

	public static void main(String[] args) {
		
        Map<String ,String> hMap=new HashMap<String,String>();
        hMap.put("1", "Roger");
        hMap.put("2", "Santha");
        hMap.put("3", "Perian");
        
        for (String key : hMap.keySet()) {
           System.out.println("Key: " + key + " | Value: " + hMap.get(key));
        }        
        System.out.println("\n");
        
        Iterator<String> keySetIterator = hMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
        	String key = keySetIterator.next();
            System.out.println("Key: " + key + " | Value: " + hMap.get(key));
         }        
        
	}

}
