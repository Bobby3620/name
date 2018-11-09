package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kbInput = new Scanner(new File("scores.txt"));
        int maxIndex = -1;
        String text[] = new String[1000];

        //This prints out every line in the scores file
        while(kbInput.hasNext()){
            maxIndex++;
            text[maxIndex] = kbInput.nextLine();
        }

        kbInput.close();

        //Prints out the schools



    }
}
