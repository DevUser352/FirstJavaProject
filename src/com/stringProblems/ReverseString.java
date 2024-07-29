package com.stringProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void revers(String string) {
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }

    public static void revers1(String string) {
        StringBuilder reversed = new StringBuilder(string);
        System.out.println(reversed.reverse().toString());
    }

    public static void revers2(String string) {
        StringBuffer reversed = new StringBuffer();
        System.out.println(reversed.reverse().toString());
    }

    public static void revers3(String string) {
        if (string == null) {
            System.out.println("String is null");
        }
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }

    public static void revers4(String string) {
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        System.out.println(reversed);
    }

    public static String revers5(String string) {
        if (string == null || string.length() <= 1) {
            return string;
        }
        return revers5(string.substring(1)) + string.charAt(0);
    }

    public static String revers6(String string) {
        if (string == null) {
            return null;
        }
        char[] charArray = string.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static String revers7(String string){
        if (string == null){
            return null;
        }
        List<String> list = Arrays.asList(string.split(""));
        Collections.reverse(list);
        return String.join("",list);
    }

    public static String revers8(String string){
        if (string == null){
            return null;
        }
        return new StringBuilder(string)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        String string = "Ravi";
        String string1 = revers8(string);
        System.out.println(string1);
    }

}
