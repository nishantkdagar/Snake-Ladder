package com.snakeandladder;
import java.util.Random;
public class SnakeAndLadder {
    public static final int ladder = 0;
    public static final int snake = 1;
    public static void main(String[] args){
        int Player_Position = 0;
        Random rm = new Random();
        int Dice_Throw = rm.nextInt(7);
        int Move = rm.nextInt(2);
        switch (Move){
            case ladder:
                Player_Position = Player_Position + Dice_Throw;
                System.out.println("The Player took the ladder and is at : "+Player_Position);
                break;
            case snake:
                Player_Position = Player_Position - Dice_Throw;
                System.out.println("The Player was bit by the snake and is at : "+Player_Position);
                break;
            default:
                System.out.println("The Player didn't move at all and is at : "+Player_Position);
        }
    }
}
