package com.thoughtworks;

import java.util.ArrayList;

public class guessResult {
    public static String returnResult(String input, ArrayList<String> answer, int guessTime){
        int correct = 0;
        int wrongPlace = 0;
        String[] input2 = input.split("");
        for(int i=0;i<answer.size();i++){
            if(input2[i].equals(answer.get(i))){
                correct += 1;
            }else if(answer.contains(input2[i])){
                wrongPlace += 1;
            }
        }
        if(correct==4){
            return "Correct";
        }
        return String.format("The %d time: %dA%dB.\n", guessTime+1, correct, wrongPlace);
    }
}
