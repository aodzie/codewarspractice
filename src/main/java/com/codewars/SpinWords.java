package com.codewars;

/*
Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"
 */

public class SpinWords {
    public String spinWords(String sentence) {
        String [] letters = sentence.split(" ");
        String output = "";
        for (int i=0; i< letters.length; i++){
            if (letters[i].length() >= 5){
                for (int n=letters[i].length()-1; n>=0; n--){
                    output=output+letters[i].charAt(n);
                }
            }
            else output = output + letters[i];
            if (i!= letters.length-1)
                output = output+" ";
        }
        return output;
    }
}
