package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor ");
        int UserInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt();

        if(UserInput==ComputerInput){
            System.out.println("Draw");
        }
        else if(UserInput==0 && ComputerInput==2 || UserInput==1 && ComputerInput==0 || UserInput==2 && ComputerInput==1){
            System.out.println("You Wins");
        }
        else{
            System.out.println("Computer Wins");
        }
        if(ComputerInput==0){
            System.out.println("Computers Choice is: Rock");
        }
        else if(ComputerInput==1){
            System.out.println("Computers Choice is: Paper");
        }
        else if(ComputerInput==2){
            System.out.println("Computers Choice is: Scissor");
        }
    }
}
