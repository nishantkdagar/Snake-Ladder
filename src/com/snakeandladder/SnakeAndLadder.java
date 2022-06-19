package com.snakeandladder;
import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int Player_Position = 0;
        Random rm = new Random();
        int Dice_Throw = rm.nextInt(7);
        if (Dice_Throw > 0){
            Player_Position = Player_Position + Dice_Throw;
            System.out.println("The Player's new position is: "+Player_Position);
        }
        else {
            System.out.println("The player is still at: "+Player_Position);
        }
    }
}
