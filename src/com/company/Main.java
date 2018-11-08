package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
	    Scanner knInput = new Scanner(new File("scores.txt"));
        int maxIndex = -1;
        String text[] = new String[1000];
        Double reading[] = new Double[1000];
        Double writing[] = new Double[1000];

        while(knInput.hasNext()){
            maxIndex++;
            //text[maxIndex]= knInput.useDelimiter("\\s*Percent White\\s*");
            System.out.println();

        }
        for(int i = 0; i < 1; i++)
            System.out.println(text[i]);

    }
}
