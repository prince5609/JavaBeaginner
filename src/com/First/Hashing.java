package com.First;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String [] args){
        HashMap<String, Integer> countryInfo = new HashMap<>();
        countryInfo.put("India", 120);
        countryInfo.put("Us", 30);
        countryInfo.put("China", 150);
        // Hashmap are unordered

        System.out.println(countryInfo);
        countryInfo.put("China", 180);
        System.out.println(countryInfo);  // info will be updated

        // SEARCH
        if(countryInfo.containsKey("China")){
            System.out.println("Yes Key Exist and its value is " + countryInfo.get("China"));
        }
        else
            System.out.println("Key doesn't Exist");

        for (Map.Entry<String, Integer> e : countryInfo.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
