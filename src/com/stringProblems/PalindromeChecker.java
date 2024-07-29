package com.stringProblems;

public class PalindromeChecker {
    public static void main(String[] args) {
        String string = "madam";
        boolean isPalindrome = isPalindromeUsingStringBuilder(string);
        System.out.println(isPalindrome);
    }
    public static boolean isPalindromeUsingStringBuilder(String string){
        if (string == null){
            return false;
        }
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
    public static boolean isPalindromeUsingTwoPointer(String string) {
        if (string == null){
            return false;
        }
        int left = 0;
        int right = string.length()-1;
        while (left < right){
            if (string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
