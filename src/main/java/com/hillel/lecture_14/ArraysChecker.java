package com.hillel.lecture_14;

import java.util.*;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {
        ArrayList<String> s = new ArrayList();
//        TODO implements result
        for (int i = list.size()-1; i >= 0; i--){
            s.add(list.get(i));
        }
        list = s;
        return list;
    }

    public String getLongestString(List<String> list) {

//        TODO implements result
        String result = list.get(0);;
        for (String element : list) {
            if (element.length() > result.length()) {
                result = element;
            }
        }

        return result;
    }

    public List<String> changeIndex(List<String> list) {

//        TODO implements result
        String el1 = list.get(1);
        String el2 = list.get(3);
        list.set(1,el2);
        list.set(3,el1);
        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

//        TODO implements result
        List<String> newList = new ArrayList();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result
        Collections.sort(list);
        return list;
    }
}
