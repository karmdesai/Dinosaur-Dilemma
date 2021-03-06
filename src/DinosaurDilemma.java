
/**
 * This is the 'main' class for the Dinosaur Dilemma game.
 * Dinosaur Dilemma is a game for children about Yoshi and the Mario series.
 *
 * Made by Karm Desai (@karmdesai)
 * Version 1.0 (April 12th, 2019)
 */

// Import the required packages/dependencies
import java.lang.System;

public class DinosaurDilemma
{

    public static void main (String args[])
    {
        new DinosaurDilemma ();
    }

    public DinosaurDilemma ()
    {
        // Print out the introduction ASCII art
        PrintItems.printIntro();

        // Welcome the user and ask them for the password
        System.out.println ("Hi! Welcome to Dinosaur Dilemma!");
        System.out.println ("In this game, you'll have to press 'enter' to read the next line.\n");
        String userPassword = IBIO.inputString ("Please enter the password that came with your game in order to access it.  ");

        // Verify that the password entered is correct while ignoring case
        while (!(userPassword.equalsIgnoreCase("qvabfnhe-qvyrzzn")))
        {
            // Let the user know the password is incorrect
            System.out.println ("");
            System.out.println ("Incorrect password!");

            // While the entered password is incorrect, ask for it again
            userPassword = IBIO.inputString ("Please enter the password that came with your game in order to access it. \n");
        }

        // Spacing
        System.out.println ("Correct Password! Beginnning Game...");
        System.out.println ("");
        System.out.println ("");

        // Initiate the live count
        int playerLives = 3;

        // While the player has more than zero lives, start the game (plot)
        while (playerLives > 0)
        {
            // Briefly introduce the main character (Yoshi)
            PrintItems.printFile ("../storyFiles/paragraphOne.txt");
            PrintItems.printYoshi ();

            // Introduce the backstory/plot
            PrintItems.printFile ("../storyFiles/paragraphTwo.txt");
            PrintItems.printFile ("../storyFiles/paragraphThree.txt");

            // Ask if the user is up to the challenge (convert input to lower case to avoid case errors)
            String playChoice = IBIO.inputString ("Yoshi, are you up to the task? Enter 'Yes' if you are or 'No' if you're not!\n");
            System.out.println ("");

            // While playChoice is neither 'yes' or 'no', keep asking
            while (!(playChoice.equalsIgnoreCase("yes")) && !(playChoice.equalsIgnoreCase("no")))
            {
                System.out.println ("That's not a valid choice!");
                playChoice = IBIO.inputString ("Yoshi, are you up to the task? Enter 'Yes' if you are or 'No' if you're not!\n");
                System.out.println ("");
            }

            // Spacing
            System.out.println ("");
            System.out.println ("");

            // If the user doesn't want to play, exit the game
            if (playChoice.equalsIgnoreCase("no"))
            {
                // Print the appropriate (notPlaying) text
                PrintItems.printFile ("../storyFiles/notPlaying.txt");
                PrintItems.printEnding ();

                // Use System.exit to exit the program
                System.exit(0);
            }        

            // Continue on with the plot (Shell-Flower-Mushroom, Guard Koopa)
            PrintItems.printFile ("../storyFiles/paragraphFour.txt");

            // If the user lost shellFlowerMushroom (i.e. didWin is false)
            if (MiniGames.shellFlowerMushroom() == false)
            {
                // Let the user know they lost the game and subtract a life
                System.out.println ("You lost the game...");

                playerLives -= 1;

                // Summarize the player's live count
                System.out.println ("You lost a life. You currently have: " + playerLives + " lives.");
                System.out.println ("");
                System.out.println ("");
                System.out.println ("Fortunately, the Guard Koopa ran away. Go on, open the door.");
            }

            // If the user won, continue on with the plot
            else
            {
                System.out.println ("");
                System.out.println ("Great job! You beat the guard Koopa. Go on, open the door.");
            }

            // Continue on with the plot (3 Math Questions, Koopa Horde)        
            PrintItems.printFile ("../storyFiles/paragraphSix.txt");
            MiniGames.mathQuestions();

            // Continue on with the plot (Magical Orb)
            PrintItems.printFile ("../storyFiles/paragraphSeven.txt");
            PrintItems.printOrb();

            // Ask the user to shake the orb
            String shakeOrb = IBIO.inputString ("Type 'Shake' to shake the magical orb! ");

            // While shakeOrb is not 'Shake', keep asking
            while (!(shakeOrb.equalsIgnoreCase("shake")))
            {
                System.out.println ("That's not a valid choice!\n");
                System.out.println ("");
                shakeOrb = IBIO.inputString ("Type 'Shake' to shake the magical orb! ");
                System.out.println ("");
            }

            // Since 'magicOrb' returns an integer (either 1 or 3), add it to playerLives as a powerup
            playerLives += MiniGames.magicOrb();
            System.out.println ("You currently have " + playerLives + " lives.");
            System.out.println ("");

            // Continue on with the plot (introduce Mario)
            PrintItems.printFile ("../storyFiles/paragraphEight.txt");
            PrintItems.printMario ();
            PrintItems.printFile ("../storyFiles/paragraphNine.txt");

            // Ask the user if they want to become friends with Mario
            String friendMario = IBIO.inputString ("Enter 'Yes' if you do or 'No' if you don't. ");
            System.out.println ("");

            // While friendMario is not a 'Yes'
            while (!(friendMario.equalsIgnoreCase("yes")))
            {
                System.out.println ("You should really reconsider your decision. Mario could be of great help...");
                friendMario = IBIO.inputString ("Enter 'Yes' to become friends! ");
                System.out.println ("");            
            }

            // Continue on with the plot (introduce Bowser Jr. and 'Bob-Omb' Blast)
            PrintItems.printFile ("../storyFiles/paragraphTen.txt");
            PrintItems.printFile ("../storyFiles/paragraphEleven.txt");
            PrintItems.printBobOmb ();      

            // If the user won (i.e. didWin = true), continue on with the plot
            if (MiniGames.bobOmbBlast() == true)
            {
                System.out.println ("Congratulations, you've defeated Bowser Junior!");
                System.out.println ("This gives you some motivation and you hope to see your family soon.");
                System.out.println ("");
            }

            // Let the user know they lost the game (i.e. didWin = false) and subtract two lives
            else
            {
                System.out.println ("Bowser Junior defeated you!");
                System.out.println ("This loss cost you two lives!");

                playerLives -= 2;

                // Summarize the player's lives and move on with the plot
                System.out.println ("You currently have " + playerLives + " lives left.");
                System.out.println ("");

                System.out.println ("Fortunately, Bowser Junior ran away in fear.");
            }

            // Move on with the plot (introduce Bowser and the Warp Path)
            PrintItems.printFile ("../storyFiles/paragraphThirteen.txt");
            PrintItems.printFile ("../storyFiles/paragraphFourteen.txt");
            PrintItems.printFile ("../storyFiles/paragraphFifteen.txt");
            PrintItems.printWarpPath ();

            // Start the warpPath
            MiniGames.warpPath();

            // Continue on with the plot (present Bowser and his final challenge)
            PrintItems.printFile ("../storyFiles/paragraphSixteen.txt");
            PrintItems.printBowser ();

            // If the user got a question wrong (i.e. didWin = false)
            if (MiniGames.triviaQuestions() == false)
            {
                // Let them know that they lost
                System.out.println ("You lost the game!");            
                System.out.println ("Bowser beat you!");

                // Set their live count to zero
                playerLives = 0;

            }

            // If the user won (i.e. didWin = true)
            else
            {
                // Continue on with the plot and present the ending 
                PrintItems.printFile ("../storyFiles/paragraphSeventeen.txt");
                PrintItems.printFile ("../storyFiles/paragraphEighteen.txt");
                PrintItems.printEnding ();

                // Break out of the loop (the game is done)
                break;
            }

        }

        // If the user has zero lives
        if (playerLives == 0)
        {
            // Let them know they lost the game and print the ending
            System.out.println ("");
            PrintItems.printFile ("../storyFiles/lostGame.txt");
            PrintItems.printEnding ();
        }       
    }   
}
