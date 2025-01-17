package com.codewars;

/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
 */

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int minutes=0;
        int hours=0;
        while (seconds>=60){
            seconds = seconds-60;
            minutes++;
            if (minutes>59) {
                hours++;
                minutes = 0;
            }
        }
        String output;

        if (hours<10) output = "0" + hours + ":";
        else output = hours + ":";
        if (minutes<10) output = output + "0" + minutes + ":";
        else output = output + minutes + ":";
        if (seconds<10) output = output + "0" + seconds;
        else output = output + seconds;
        return output;
    }
}
