package com.codewars;

/*
The aim of this kata is to split a given string into different strings of equal size (note size of strings is passed to the method)

Example:

Split the below string into other strings of size #3

'supercalifragilisticexpialidocious'

Will return a new string
'sup erc ali fra gil ist ice xpi ali doc iou s'

Assumptions:

String length is always greater than 0
String has no spaces
Size is always positive
 */

public class SplitInParts {
    public static String splitInParts(String s, int partLength) {
        String output = "";
        int counter = 0;
        for (int i =0; i<s.length(); i++){
            if (counter==partLength){
                counter=0;
                output += " ";
            }
            counter++;
            output += s.charAt(i);
        }
        return output;
    }
}
