package util;

import java.util.Scanner;

public class Input {

    public static int numberOfCocktailsAvailable(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
