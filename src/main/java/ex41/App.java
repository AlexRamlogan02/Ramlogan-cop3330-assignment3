package ex41;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App
{
    public static void main( String[] args ) {
        List<String> names;
        FileWriter output;

        try{
            names = Files.readAllLines(Paths.get("src/main/java/ex41/exercise14_output.txt"), StandardCharsets.US_ASCII);
            Collections.sort(names); //sort the names with a given function

            output = new FileWriter("src/main/java/ex41/exercise14_output.txt");
            for (int i = 0; i < names.size(); i++) { //print each name in order
                // test the print System.out.print(names.get(i) + "\n");
                output.write("Total of 7 names\n---------------\n");
                output.write(names.get(i) + "\n");
            }
            output.close();
        }
        catch (Exception e){System.out.print("Fail\n");} //if it doesnt work, print fail

    }
}
