package com.all.test;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;


public class Example{
	
  public static void main(String[] args) {
    // Create an ArrayList of Strings
    List<String> list = new ArrayList<String>();
    list.add("abc");
    list.add("cfd");
    list.add("ert");

    // Create a JSONArray object
    JSONArray array = new JSONArray();

    // Add the elements of the ArrayList to the JSONArray
    array.addAll(list);
    //System.out.println(list.toString());
    
    StringBuilder sb = new StringBuilder();
    for (String s : list) {
    	sb.append(s+",");
    }
   // String result = String.join(",", list);

    System.out.println(String.join(",", list));

  }
}