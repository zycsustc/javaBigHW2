package com.thoughtworks;

import java.util.ArrayList;

public class Helper {
    public static String convert2String(ArrayList<String> list){
        StringBuilder str = new StringBuilder();
        for(String s: list){
            str.append(s);
        }
        return str+"";
    }

    public static ArrayList<String> convert2ArrayList(String input){
        String[] input2 = input.split("");
        ArrayList<String> list = new ArrayList<>();
        for(String s: input2){
            list.add(s);
        }
        return list;
    }

    public static Boolean containSame(String guess){
        String[] guess2 = guess.split("");
        ArrayList<String> guess3 = new ArrayList<>();
        for(String s: guess2){
            if(guess3.contains(s)){
                return true;
            }else {
                guess3.add(s);
            }
        }
        return false;
    }
}
