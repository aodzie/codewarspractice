package com.codewars;

/*
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
 */

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        String output = "";
        if (p1.equals(p2)) output = "Draw!";
        else if(p1.equals("scissors")){
            if (p2.equals("paper")) output = "Player 1 won!";
            else output = "Player 2 won!";
        }
        else if(p1.equals("rock")){
            if (p2.equals("scissors")) output = "Player 1 won!";
            else output = "Player 2 won!";
        }
        else if(p1.equals("paper")){
            if (p2.equals("rock")) output = "Player 1 won!";
            else output = "Player 2 won!";
        }
        return output;
    }
}
