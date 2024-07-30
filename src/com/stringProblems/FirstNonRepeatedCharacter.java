package com.stringProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static Character firstNonRepeCharacter(String string){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        for (char ch : string.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String string = "aapple";
        System.out.println("First Non-Repeated character: " + firstNonRepeCharacter(string));
    }
}
