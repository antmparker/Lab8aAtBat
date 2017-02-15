package bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "";
        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println("");

        System.out.print("Enter number of batters: ");
        int numBatters = scan.nextInt();

        System.out.print("Enter number of times at-bat: ");
        int atBat = scan.nextInt();

        int[][] batStats = new int[numBatters][atBat];

        for (int row = 0; row < batStats.length; row++) {
            System.out.println("");
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            System.out.print("Enter Batter " + (row + 1) + " bases: ");

            for (int col = 0; col < batStats[row].length; col++) {

                while (atBat <= 0) {
                    System.out.print("Enter positive number :");
                    atBat = scan.nextInt();
                }


                batStats[row][col] = scan.nextInt();
            }
        }

        for (int row = 0; row < batStats.length; row++) {

            double count = 0;
            double sum = 0;


            while (atBat < 0 || atBat > 4) {

                System.out.print("Error! Enter a number (0,1,2,3,4): ");
                atBat = scan.nextInt();
            }
            for (int col = 0; col < batStats.length; col++) {

                sum += batStats[row][col];

                if (batStats[row][col] > 0.0) {
                    count++;

                }
            }
            double batAvg = count / batStats[row].length;
            System.out.printf("For batter %d, Batting Average: %.3f", (row + 1), batAvg);

            double slugPerc = sum / batStats.length;
            System.out.printf("\tSlugging Percentage: %.3f\n", slugPerc);


        }
    }

}


