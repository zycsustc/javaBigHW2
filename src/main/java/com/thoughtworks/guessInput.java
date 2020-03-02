package com.thoughtworks;

public class guessInput {
    public static Boolean inputControl(String guess){
        try{
            if(guess.length()!=4){
                throw new WrongInputException("Input must be four digits! Enter again!");
            }
            else if (Helper.containSame(guess)){
                throw new WrongInputException("Input mustn't contain same characters! Enter again!");
            }
        } catch (Exception e){
               return false;
        }
        return true;
    }

}
