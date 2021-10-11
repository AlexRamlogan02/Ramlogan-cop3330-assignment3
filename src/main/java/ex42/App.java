package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        List<String> input;
        List<String> finals;
        FileWriter output;
        try{
            input = Files.readAllLines(Paths.get("src/main/java/ex42/exercise42_input.txt"), StandardCharsets.US_ASCII);
            for (int i = 0; i < input.size(); i++) {
                System.out.print(input.get(i) + "\n"); //test code
            }
        }
        catch (Exception e){System.out.print("fail\n");}
    }
}
