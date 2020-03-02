package com.thoughtworks;

import java.util.ArrayList;
import java.util.Scanner;

public class numberGuess {
    public static String startGuess(int maxGuess, ArrayList<String> answer){
        int guessTime = 0;
        StringBuilder info = new StringBuilder("Guessing History:\n");
        Scanner sc = new Scanner(System.in);
        while(guessTime<maxGuess){
            System.out.println(info+"");
            System.out.println("Please enter your guess like 3456:");
            String guess = sc.next();
            Boolean test = guessInput.inputControl(guess);
            System.out.println(test);
            if(test){
                String result = guessResult.returnResult(guess, answer, guessTime);
                if(result.equals("Correct")){
                    return "Congratulations, you win!";
                }else{
                    info.append(result);
                }
                guessTime += 1;
            }
        }
        return String.format("Unfortunately, you have no chance, the answer is %s!", Helper.convert2String(answer));
    }
}
