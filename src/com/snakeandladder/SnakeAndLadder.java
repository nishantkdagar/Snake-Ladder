package com.snakeandladder;
import java.util.Random;
public class SnakeAndLadder {
    public static final int ladder = 0;
    public static final int snake = 1;
    public static void main(String[] args){
        int Player_Position = 0;
        Random rm = new Random();
        int TotalDiceRoll = 0;

        while (Player_Position < 100) {
            int Dice_Throw = rm.nextInt(6) + 1;
            int Move = rm.nextInt(3);
            TotalDiceRoll += 1;

            switch (Move) {
                case ladder:
                    if(Player_Position + Dice_Throw <= 100){
                        Player_Position = Player_Position + Dice_Throw;
                    }
                    System.out.println("The Player got "+Dice_Throw+" took the ladder and is at : " + Player_Position);
                    break;
                case snake:
                    if (Player_Position - Dice_Throw > 0) {
                        Player_Position = Player_Position - Dice_Throw;
                    }
                    else {
                        Player_Position = 0;
                    }
                    System.out.println("The Player got "+Dice_Throw+" was bit by the snake and is at : " + Player_Position);
                    break;
                default:
                    System.out.println("The Player didn't move at all and is at : " + Player_Position);
            }
        }
        System.out.println("The Dice was rolled "+TotalDiceRoll+" times to win the game.");
    }
}
