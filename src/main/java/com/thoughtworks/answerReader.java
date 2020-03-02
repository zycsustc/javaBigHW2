package com.thoughtworks;

import java.io.*;
import java.util.ArrayList;

public class answerReader {

    public static ArrayList<String> getAnswer() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(".\\src\\main\\resources\\answer.txt"));
        return Helper.convert2ArrayList(reader.readLine());
    }

}
