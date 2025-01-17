package com.codewars;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

public class StringToCamelCase {
    static String toCamelCase(String s){
        String [] arr = null;
        if (s.contains("-")) arr = s.split("-");
        else if (s.contains("_")) arr = s.split("_");
        String str = "";
        if (s.length()>0){
            str = arr[0];
            for (int i=1; i< arr.length; i++){
                char ch = Character.toUpperCase(arr[i].charAt(0));
                str = str + ch + arr[i].subSequence(1, arr[i].length());
            }}
        return str;
    }
}
