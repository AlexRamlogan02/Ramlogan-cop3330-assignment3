package ex43;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        String name, author, JSans, CSSans;
        Scanner scan = new Scanner(System.in);
        System.out.print("Site name:");
        name = scan.nextLine();
        System.out.print("Author:");
        author = scan.nextLine();
        System.out.print("Do you want a folder for JavaScript?");
        JSans = scan.nextLine();
        System.out.print("Do you want a folder for CSS?");
        CSSans = scan.nextLine();
    }
}
