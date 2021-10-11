package ex44;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        //read in data
        String findProduct;
        Scanner scan = new Scanner(System.in);
        int found = 0;
        while (found != 1)
        {
            System.out.print("What is the product name? ");
            findProduct = scan.nextLine();
        };
        //if the product isnt found, continue the while  loop
        //else (found), exit the while loop & print the name, price & quantity
    }
}
