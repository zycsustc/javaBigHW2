package com.thoughtworks;

import java.io.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) throws IOException {
    final int maxGuess = 6;
    ArrayList<String > answer = answerReader.getAnswer();
    String result = numberGuess.startGuess(maxGuess, answer);
    System.out.println(result);
  }
}
