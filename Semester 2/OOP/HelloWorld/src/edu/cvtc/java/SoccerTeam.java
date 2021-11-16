package edu.cvtc.java;

import java.util.Scanner;

public class SoccerTeam {

    public static void main(String[] args) {

        // Constants
        final int MIN_PLAYERS = 9;
        final int MAX_PLAYERS = 15;

        //Variables
        //Modified by Davis 9/15/21
        //Modified by Chris 9/25/21
        int players, teamSize, teams, leftOver;

        Scanner keyboard = new Scanner(System.in);

        //Get number of players
        System.out.print("How many players on a team: ");
        teamSize = keyboard.nextInt();

        // Validate the input
        while(teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS){

            System.out.println("You should have at least " + MIN_PLAYERS + " but no more than "
                + MAX_PLAYERS + " per team.");

            System.out.print("How many players on a team: ");
            teamSize = keyboard.nextInt();
        }

    }
}
