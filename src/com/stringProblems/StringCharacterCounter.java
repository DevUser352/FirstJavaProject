package com.stringProblems;

import java.util.HashMap;

public class StringCharacterCounter {

    public static HashMap<String,Integer> countCharacters (String string){
        HashMap<String,Integer> characterCount = new HashMap<>();
        characterCount.put("Vowels",0);
        characterCount.put("Consonants",0);
        characterCount.put("Special Characters",0);

        string = string.toLowerCase();

        for (char ch : string.toCharArray()){
            if (ch >= 'a' && ch <= 'z'){
                if (isVowels(ch)){
                    characterCount.put("Vowels", characterCount.get("Vowels")+1);
                }else {
                    characterCount.put("Consonants",characterCount.get("Consonants")+1);
                }
            }else {
                characterCount.put("Special Characters",characterCount.get("Special Characters")+1);
            }
        }
            return characterCount;
    }

    private static boolean isVowels(char ch) {
        return ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String string = "R@v! Is @ gre@t @utomatI)n Eng!n@@r";
        HashMap<String ,Integer> result = countCharacters(string);
        System.out.println(result);
    }
}
