package com.dsimon;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        //  create a method called displayHighScorePosition
        //  it should take a players name as a parameter, and a 2nd parameter as a position in the high score table
        //  You should display the player's name along with a message like " managed to get into position " and the
        //  position they got and a further message " on the high score table"

        //  create a second method called calculateHighScorePosition
        //  it should be sent one argument only, the player score
        //  it should return an int
        //  the return should be:
            //  1 if the score is > 1000
            //  2 if the score is > 500 and < 1000
            //  3 if the score is > 100 and < 500
            //  4 in all other cases
        //  call both methods and display the results of the following:
        //  a score of 1500, 900, 400, and 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Doug", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Whoever", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Iunno", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Some Guy", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
