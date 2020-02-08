package com.binita.recipe.controller;

import java.util.*;

public class HashmapSorting {

    private HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm){
        List<Map.Entry<String, Integer>> hmList = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(hmList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                return stringIntegerEntry.getValue().compareTo(t1.getValue());
            }
        });

        HashMap<String, Integer> hmOutput = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> aa:hmList){
            hmOutput.put(aa.getKey(), aa.getValue());

        }
        return hmOutput;

    }

    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Maths", 99);
        hm.put("English", 84);
        hm.put("Hindi", 75);
        hm.put("Science", 93);
        hm.put("Gujarati", 80);
        hm.put("english", 90);
        hm.forEach((k,v)->System.out.println("Key : "+k +", Value : "+v));
        HashmapSorting hmSort = new HashmapSorting();
        HashMap sortedhm = null;//hmSort.sortByValue(hm);
        System.out.println("****Sorted****");
        sortedhm.forEach((k, v) -> System.out.println("Key : "+k +", Value : "+v));


    }
}
