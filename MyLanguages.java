package com.codewars.anter69;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class MyLanguages {
  public static List<String> myLanguages(final Map<String, Integer> results) {
    List<String> result = new ArrayList<>();
    // sort list
    List<Map.Entry<String, Integer>> list = new ArrayList<>(results.entrySet());
    list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
    
    for (Map.Entry<String, Integer> entry : list) {
      if (entry.getValue() >= 60) {
        result.add(entry.getKey());
      }
    } 
    return result;
  }
}
