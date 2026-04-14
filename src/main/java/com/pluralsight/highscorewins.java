package com.pluralsight;
import java.util.regex.Pattern;
import java.util.Scanner;

public class highscorewins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the score of Home and Visitor: ");
        String score = scan.nextLine();

        String[] splitScore = score.split(Pattern.quote(":"));

        String firstTeam = splitScore[0];
        String secondTeam = splitScore[1];
        String numOne = splitScore[2];


        System.out.println(firstTeam);
        System.out.println(secondTeam);
        System.out.println(numOne);

    }
}
