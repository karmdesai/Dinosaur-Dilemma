
/**
 * This is the 'MiniGames' file for the Dinosaur Dilemma game.
 * This contains the code (in the form of methods) for all of the MiniGames.
 * 
 * Made by Karm Desai (@karmdesai)
 * Version 1.0 (April 12th, 2019)
 */

public class MiniGames
{

    static boolean shellFlowerMushroom ()
    {
        // didWin starts off as false
        boolean didWin = false;

        // Both the computer and the player start off with 0 points
        int computerPoints = 0;
        int playerPoints = 0;

        // Introduce the game and how it is played
        System.out.println ("Shell-Flower-Mushroom is a game like rock-paper-scissors.");
        System.out.println ("The rules are simple: shell beats flower, flower beats mushroom, and mushroom beats shell.");
        System.out.println ("The first player to three points wins.");
        System.out.println ("Ready? Go!");
        System.out.println ("");

        // The player has to press enter to start the game
        IBIO.inputString ("");

        // While both players have less than 3 points
        while (playerPoints < 3 && computerPoints < 3)
        {
            // Ask the user what they will play
            System.out.println ("You have to pick what you will play this round.");
            String userChoice = IBIO.inputString ("Type 'Shell' to pick shell. Type 'Flower' to pick flower. Type 'Mushroom' to pick mushroom. ");

            // Convert to lower case to avoid casing errors and for output formatting
            userChoice = userChoice.toLowerCase();
            System.out.println ("");

            // While their choice is not valid, keep asking them for input
            // Convert to lower case to avoid casing errors
            while (!(userChoice.equals("shell")) && !(userChoice.equals("flower")) && !(userChoice.equals("mushroom")))
            {
                System.out.println ("Invalid choice.");
                userChoice = IBIO.inputString ("Type 'Shell' to pick shell. Type 'Flower' to pick flower. Type 'Mushroom' to pick mushroom. ");
                userChoice = userChoice.toLowerCase();
                System.out.println ("");
            }

            // Randomly make the computer choose a number between 1-3
            int computerChoiceNum = (int)(Math.random() * 3 + 1);
            String computerChoice = "None";

            // Give the random numbers (that the computer chose) a meaning
            if (computerChoiceNum == 1)
            {
                computerChoice = "shell";
            }

            else if (computerChoiceNum == 2)
            {
                computerChoice = "flower";
            }

            else if (computerChoiceNum == 3)
            {
                computerChoice = "mushroom";
            }

            // Summarize the user's choice and the computer's choice
            System.out.println ("The Guard Koopa picked: " + computerChoice + ".");
            System.out.println ("You picked: " + userChoice + ".");

            // Compare the computer's choice and the user's choice using nested loops
            // Outcomes if the user chooses 'shell'
            if (userChoice.equals("shell"))
            {
                // Shell - Shell = Tie
                if (computerChoice.equals("shell"))
                {
                    System.out.println ("It is a tie.");
                }

                // Shell - Flower = User Wins
                else if (computerChoice.equals("flower"))
                {
                    System.out.println ("You won this round!");
                    playerPoints += 1;
                }

                // Shell - Mushroom = Computer Wins
                else
                {
                    System.out.println ("The Guard Koopa won this round.");
                    computerPoints += 1;
                }
            }

            // Outcomes if the user chooses 'flower'
            else if (userChoice.equals("flower"))
            {
                // Flower - Shell = Computer Wins
                if (computerChoice.equals("shell"))
                {
                    System.out.println ("The Guard Koopa won this round.");
                    computerPoints += 1;
                }

                // Flower - Flower = Tie
                else if (computerChoice.equals("flower"))
                {
                    System.out.println ("It is a tie.");
                }

                // Flower - Mushroom = User Wins
                else
                {
                    System.out.println ("You won this round!");
                    playerPoints += 1;
                }
            }

            // Outcomes if the user chooses anything else ('mushroom' is the only other option)
            else
            {
                // Mushroom - Shell = User Wins
                if (computerChoice.equals("shell"))
                {
                    System.out.println ("You won this round!");
                    playerPoints += 1;
                }

                // Mushroom - Flower = Computer Wins
                else if (computerChoice.equals("flower"))
                {
                    System.out.println ("The Guard Koopa won this round.");
                    computerPoints += 1;
                }

                // Mushroom - Mushroom = Tie
                else
                {
                    System.out.println ("It is a tie.");
                }
            }

            // Print a summary of the points (after the round has finished)
            System.out.println ("");
            System.out.println ("You have: " + playerPoints + " points.");
            System.out.println ("The Guard Koopa has: " + computerPoints + " points.");
            System.out.println ("");

        }

        // If the user won the game, didWin becomes true
        if (playerPoints > computerPoints)
        {
            didWin = true;
        }

        // Return didWin
        return didWin;

    }

    static void mathQuestions ()
    {
        //questionsCorrect starts off as zero
        int questionsCorrect = 0;

        // While the user has less than 3 questions correct
        while (questionsCorrect < 3)
        {
            // Spacing
            System.out.println ("");

            // The first question should be addition
            // Two integers between 1 - 1000
            int currentIntOne = (int)(Math.random() * 1000 + 1);
            int currentIntTwo = (int)(Math.random() * 1000 + 1);

            // The question's total is the sum of the two integers
            int currentQuestion = currentIntOne + currentIntTwo;

            // Ask the question
            int userAnswer = IBIO.inputInt("Question: What is " + currentIntOne + " + " + currentIntTwo + "? ");

            // If the user gets the question wrong, reset their points to zero
            if (userAnswer != currentQuestion)
            {
                System.out.println ("Incorrect! You'll have to start over...");
                questionsCorrect = 0;
            }

            // Otherwise let the user know they got it right and add one to questionsCorrect
            else
            {
                System.out.println ("Correct!");
                questionsCorrect += 1;
            }

            // The second question should be multiplication
            // Two integers between 1 - 25
            currentIntOne = (int)(Math.random() * 25 + 1);
            currentIntTwo = (int)(Math.random() * 25 + 1);

            // The question's total is the product of the two integers
            currentQuestion = currentIntOne * currentIntTwo;

            // Ask the question
            System.out.println ("");
            userAnswer = IBIO.inputInt("Question: What is " + currentIntOne + " * " + currentIntTwo + "? ");

            // If the user gets the question wrong, reset their points to zero
            if (userAnswer != currentQuestion)
            {
                System.out.println ("Incorrect! You'll have to start over...");
                questionsCorrect = 0;
            }

            // Otherwise let the user know they got it correct and add one to questionsCorrect
            else
            {
                System.out.println ("Correct!");
                questionsCorrect += 1;
            }

            // The third question should be subtraction
            // Two integers between 1 - 1000
            currentIntOne = (int)(Math.random() * 1000 + 1);
            currentIntTwo = (int)(Math.random() * 1000 + 1);

            // The question's total is the difference of the two integers
            currentQuestion = currentIntOne - currentIntTwo;

            // Ask the question
            System.out.println ("");
            userAnswer = IBIO.inputInt("Question: What is " + currentIntOne + " - " + currentIntTwo + "? ");

            // If the user gets the question wrong, reset their points to zero
            if (userAnswer != currentQuestion)
            {
                System.out.println ("Incorrect! You'll have to start over...");
                questionsCorrect = 0;
            }

            // Let the user know they got the question right and add one to questionsCorrect
            else
            {
                System.out.println ("Correct!");
                questionsCorrect += 1;
            }

        }

        // Spacing
        System.out.println ("");

    }

    static int magicOrb ()
    {
        // Establish the user's reward (0 lives at the start)
        int userReward = 0;

        // Choose a random number between 1 - 3
        int orbNum = (int)(Math.random() * 3) + 1;

        // If the random number is one
        if (orbNum == 1)
        {
            // Let the user know the orb's decision
            System.out.println ("The Orb says: 'Your Lives Have Increased By One Point.'");
            System.out.println ("Congratulations! The Magic Orb gave you one additional life!");
            System.out.println ("");

            // Increase the player's lives by 1
            userReward = 1;
        }

        // If the random number is two
        else if (orbNum == 2)
        {
            // Let the user know the orb's decision
            System.out.println ("The Orb says: 'Your Lives Have Increased By Three Points.'");
            System.out.println ("Congratulations! The Magic Orb gave you three additional lives!");
            System.out.println ("");

            // Increase the player's lives by 3;
            userReward = 3;
        }

        // Else (the random number has to be three)
        else
        {
            // Let the user know the orb's decision
            System.out.println ("The Orb says: 'Unsure... Try Again.'");
            System.out.println ("You shook the orb again.");
            System.out.println ("");

            // Choose another random integer
            orbNum = (int)(Math.random() * 2) + 1;

            // If the random number is one
            if (orbNum == 1)
            {
                System.out.println ("The Orb says: 'Your Lives Have Increased By One Point.'");
                System.out.println ("Congratulations! The Magic Orb gave you one additional life!");
                System.out.println ("");

                // Increase the player's lives by 1
                userReward = 1;
            }

            // If the random number is two
            else if (orbNum == 2)
            {
                System.out.println ("The Orb says: 'Your Lives Have Increased By Three Points.'");
                System.out.println ("Congratulations! The Magic Orb gave you three additional lives!");
                System.out.println ("");

                // Increase the player's lives by 3;
                userReward = 3;
            }
        }

        // Return userReward
        return userReward;
    }

    // Method to play bobOmbBlast
    static boolean bobOmbBlast ()
    {
        // didWin starts off as false
        boolean didWin = false;

        // Introduce the game and how it is played
        System.out.println ("Bob-Omb Blast is a game like Blackjack.");
        System.out.println ("Both you and Bowser Junior will be dealt two cards (numbers) at random.");
        System.out.println ("Your score is the sum of all your cards (numbers).");
        System.out.println ("You can keep asking for random cards to be added to your hand until your score exceeds 21.");
        System.out.println ("You can win the game by achieving an exact score of 21 or by scoring higher than Bowser Junior.");
        System.out.println ("However, if you score greater than 21, I win!'");
        System.out.println ("Ready? Go!");
        System.out.println ("");

        // The player has to press enter to start the game
        IBIO.inputString ("");

        // Set playerTotal to 0 and randomly deal two cards (numbers between 1 - 11)
        int playerTotal = 0;
        int playerCardOne = (int)(Math.random() * 11 + 1);
        int playerCardTwo = (int)(Math.random() * 11 + 1);

        // Add the cards to the total
        playerTotal = playerCardOne + playerCardTwo;

        // Summarize the player's hand
        System.out.println ("Your first card is: " + playerCardOne + ".");
        System.out.println ("Your second card is: " + playerCardTwo + ".");
        System.out.println ("Your total is: " + playerTotal + ".");
        System.out.println ("");

        if (playerTotal == 21)
        {
            // Let the player know they won
            System.out.println ("Boom! You scored exactly 21 points!");
            System.out.println ("You won the game!");
            System.out.println ("");

            // Set didWin to true and return it
            didWin = true;
            return didWin;
        }

        else if (playerTotal > 21)
        {
            // Let the player know they busted
            System.out.println ("You went over 21 points!");
            System.out.println ("You lost the game!");
            System.out.println ("");

            // Return didWin
            return didWin;
        }

        // While the playerTotal is less than 21
        while (playerTotal < 21)
        {
            String nextCard = IBIO.inputString ("Would you like another card? Enter 'Yes' if you do or 'No' if you don't.\n");
            System.out.println ("");

            // While nextCard is neither 'yes' or 'no', keep asking
            while (!(nextCard.equalsIgnoreCase("yes")) && !(nextCard.equalsIgnoreCase("no")))
            {
                System.out.println ("That's not a valid choice!");
                nextCard = IBIO.inputString ("Would you like another card? Enter 'Yes' if you do or 'No' if you don't.\n");
                System.out.println ("");
            }

            // If the user wants a new card, choose one at random
            if (nextCard.equalsIgnoreCase("yes"))
            {
                int newCard = (int)(Math.random() * 11 + 1);

                playerTotal += newCard;

                // Summarize the player's hand
                System.out.println ("Your newest card is: " + newCard + ".");
                System.out.println ("Your total is: " + playerTotal + ".");
                System.out.println ("");

                if (playerTotal == 21)
                {
                    // Let the player know they won and set didWin to true
                    System.out.println ("Boom! You scored exactly 21 points!");
                    System.out.println ("You won the game!");
                    System.out.println ("");

                    // Set didWin to true and return it
                    didWin = true;
                    return didWin;
                }

                else if (playerTotal > 21)
                {
                    // Let the player know they busted
                    System.out.println ("You went over 21 points!");
                    System.out.println ("You lost the game!");
                    System.out.println ("");

                    // Return didWin
                    return didWin;
                }

            }

            // Let the user know that their turn ended and break out of the loop
            else
            {
                System.out.println ("Alright, your turn ended.");
                break;         
            }
        }

        // Summarize the user's turn
        System.out.println ("You ended off with a total of " + playerTotal + ".");
        System.out.println ("");
        System.out.println ("");

        // Set dealerTotal to 0 and randomly deal two cards (numbers between 1 - 11)
        int dealerTotal = 0;
        int dealerCardOne = (int)(Math.random() * 11 + 1);
        int dealerCardTwo = (int)(Math.random() * 11 + 1);

        // Add the cards to the total
        dealerTotal = dealerCardOne + dealerCardTwo;

        // Summarize the player's hand
        System.out.println ("Bowser Junior's first card is: " + dealerCardOne + ".");
        System.out.println ("Bowser Junior's second card is: " + dealerCardTwo + ".");
        System.out.println ("Bowser Junior's total is: " + dealerTotal + ".");
        System.out.println ("");

        if (dealerTotal == 21)
        {
            // Let the player know that Bowser Junior won
            System.out.println ("Boom! Bowser Junior scored exactly 21 points!");
            System.out.println ("You lost the game!");
            System.out.println ("");

            // Return didWin
            return didWin;
        }

        else if (dealerTotal > 21)
        {
            // Let the player know that Bowser Junior busted
            System.out.println ("Bowser Junior went over 21 points!");
            System.out.println ("You won the game!");
            System.out.println ("");

            // Set didWin to true and return it
            didWin = true;
            return didWin;
        }

        // While the dealer has less than 21 and the player (or equal to the player)
        while ((dealerTotal < 21 && dealerTotal <= playerTotal))
        {
            int dealerNewCard = (int)(Math.random() * 11 + 1);

            dealerTotal += dealerNewCard;

            // Summarize the dealer's hand
            System.out.println ("Bowser Junior's newest card is: " + dealerNewCard + ".");
            System.out.println ("His total is: " + dealerTotal + ".");
            System.out.println ("");

            if (dealerTotal == 21)
            {
                // Let the player know that Bowser Junior won
                System.out.println ("Boom! Bowser Junior scored exactly 21 points!");
                System.out.println ("You lost the game!");
                System.out.println ("");

                // Return didWin
                return didWin;
            }

            else if (dealerTotal > 21)
            {
                // Let the player know that Bowser Junior busted
                System.out.println ("Bowser Junior went over 21 points!");
                System.out.println ("You won the game!");
                System.out.println ("");

                // Set didWin to true and return its value
                didWin = true;
                return didWin;
            }

        }

        // If didWin has not been returned yet

        // Summarize the game
        System.out.println ("Your total was: " + playerTotal + ".");
        System.out.println ("Bowser Junior's total was: " + dealerTotal + ".");
        System.out.println ("");

        // If the user's points are higher
        if (playerTotal > dealerTotal)
        {
            System.out.println ("Your score was higher. You won the game!");

            // Set didWin to true
            didWin = true;
        }

        // If the user's points are lower
        else
        {
            System.out.println ("Bowser Junior's score was higher. You lost the game!");
        }

        // Return didWin
        return didWin;

    }

    static void warpPath ()
    {
        // The final position to achieve/reach is 11
        int finalPosition = 11;

        // The current/starting position is 1
        int currentPosition = 1;

        // Summarize the player's situation
        System.out.println ("You are currently at position " + currentPosition + ".");
        System.out.println ("The end of the path is " + (finalPosition - currentPosition) + " spaces away.");
        System.out.println ("");

        // While the user has not reached the finalPosition
        while (currentPosition < finalPosition)
        {

            // List out the possibilites (square positions) one-by-one
            if (currentPosition == 1)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 1: This is a regular square.");
                System.out.println ("No special effects activated.");
                System.out.println ("");
            }

            else if (currentPosition == 2)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 2: This is a regular square.");
                System.out.println ("No special effects activated.");
                System.out.println ("");
            }

            else if (currentPosition == 3)
            {
                // Summarize the position/square's effects
                // The user has to answer a math question to pass
                System.out.println ("Position 3: This is a 'Koopa' square.");
                System.out.println ("Answer a math question to pass.");
                System.out.println ("");

                // Choose two numbers between 1-1000 and establish the total
                int questionIntOne = (int)(Math.random() * 1000 + 1);
                int questionIntTwo = (int)(Math.random() * 1000 + 1);

                int questionTotal = questionIntOne + questionIntTwo;

                // Ask the question
                int userAnswer = IBIO.inputInt ("Question: What is " + questionIntOne + " + " + questionIntTwo + "? ");
                System.out.println ("");

                // While the answer is wrong, keep asking for it
                while (questionTotal != userAnswer)
                {
                    System.out.println ("Incorrect Answer! Try again.");
                    userAnswer = IBIO.inputInt ("Question: What is " + questionIntOne + " + " + questionIntTwo + "? ");
                    System.out.println ("");
                }

                // Let the user know the answer is correct
                System.out.println ("Correct!");
                System.out.println ("");

            }

            else if (currentPosition == 4)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 4: This is a 'Goomba' square.");
                System.out.println ("Move back three spaces!");
                System.out.println ("");

                // Move the user back three spaces
                currentPosition -= 3;

                // Summarize the user's new position
                System.out.println ("You are currently at position " + currentPosition + ".");
                System.out.println ("The end of the path is " + (finalPosition - currentPosition) + " spaces away.");
                System.out.println ("");
            }

            else if (currentPosition == 5)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 5: This is a 'Mushroom' square.");
                System.out.println ("Move up one space!");
                System.out.println ("");

                // Move the user up one space
                currentPosition += 1;

                // Summarize the user's new position
                System.out.println ("You are currently at position " + currentPosition + ".");
                System.out.println ("The end of the path is " + (finalPosition - currentPosition) + " spaces away.");
                System.out.println ("");
            }

            else if (currentPosition == 6)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 6: This is a 'Koopa' square.");
                System.out.println ("Answer a math question to pass.");
                System.out.println ("");

                // Choose two numbers between 1 - 30 and establish the total
                int questionIntOne = (int)(Math.random() * 30 + 1);
                int questionIntTwo = (int)(Math.random() * 30 + 1);

                int questionTotal = questionIntOne * questionIntTwo;

                // Ask the question
                int userAnswer = IBIO.inputInt ("Question: What is " + questionIntOne + " * " + questionIntTwo + "? ");
                System.out.println ("");

                // While the answer is wrong, keep asking for it
                while (questionTotal != userAnswer)
                {
                    System.out.println ("Incorrect Answer! Try again.");
                    userAnswer = IBIO.inputInt ("Question: What is " + questionIntOne + " * " + questionIntTwo + "? ");
                    System.out.println ("");
                }

                // Let the user know they got it correct
                System.out.println ("Correct!");
                System.out.println ("");
            }

            else if (currentPosition == 7)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 7: This is a 'Star' square.");
                System.out.println ("Move up three spaces!");
                System.out.println ("");

                // Move the user up three spaces
                currentPosition += 3;

                // Summarize the user's new position
                System.out.println ("You are currently at position " + currentPosition + ".");
                System.out.println ("The end of the path is " + (finalPosition - currentPosition) + " spaces away.");
                System.out.println ("");
            }

            else if (currentPosition == 8)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 8: This is a regular square.");
                System.out.println ("No special effects activated.");
                System.out.println ("");
            }

            else if (currentPosition == 9)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 9: This is a 'Koopaling' square.");
                System.out.println ("Move back eight spaces!");
                System.out.println ("");

                // Move the user back 8 spaces
                currentPosition -= 8;

                // Summarize the user's new position
                System.out.println ("You are currently at position " + currentPosition + ".");
                System.out.println ("The end of the path is " + (finalPosition - currentPosition) + " spaces away.");
                System.out.println ("");
            }

            else if (currentPosition == 10)
            {
                // Summarize the position/square's effects
                System.out.println ("Position 10: This is a 'Koopa' square.");
                System.out.println ("Answer a math question to pass.");
                System.out.println ("");

                // Choose two random numbers between 1 - 1000 and establish their total
                int questionIntOne = (int)(Math.random() * 1000 + 1);
                int questionIntTwo = (int)(Math.random() * 1000 + 1);

                int questionTotal = questionIntOne - questionIntTwo;

                // Ask the question
                int userAnswer = IBIO.inputInt ("Question: What is " + questionIntOne + " - " + questionIntTwo + "? ");
                System.out.println ("");

                // While the user's answer is incorrect, keep asking
                while (questionTotal != userAnswer)
                {
                    System.out.println ("Incorrect Answer! Try again.");
                    userAnswer = IBIO.inputInt ("Question: What is " + questionIntOne + " - " + questionIntTwo + "? ");
                    System.out.println ("");
                }

                // Let the user know they got it correct
                System.out.println ("Correct!");
                System.out.println ("");
            }

            // Ask the user to roll the dice
            String chooseRoll = IBIO.inputString ("Enter 'Roll' to roll the three-sided die and move forward! ");
            System.out.println ("");

            // While the user doesn't enter "roll", keep asking 
            while (!(chooseRoll.equalsIgnoreCase("roll")))
            {
                System.out.println ("That is not a valid choice!");
                chooseRoll = IBIO.inputString ("Enter 'Roll' to roll the three-sided die and move forward! ");
                System.out.println ("");
            }

            // Roll a three-sided die
            int rollDie = (int)(Math.random() * 3 + 1);
            System.out.println ("You rolled a " + rollDie + ".");

            // Add the rolled number to the user's position
            currentPosition += rollDie;

            // Summarize the user's new position
            System.out.println ("You are now at position " + currentPosition + ".");
            System.out.println ("");

            // If the currentPosition is still less than the finalPosition, summarize the user's position
            if (currentPosition < finalPosition)
            {
                System.out.println ("You are currently at position " + currentPosition + ".");
                System.out.println ("The end of the path is " + (finalPosition - currentPosition) + " spaces away!");
                System.out.println ("");
            }

        }

        // When the user has reached the end, let them now
        System.out.println ("You've reached the end of the Warp Path! Congratulations!");
        System.out.println ("");
    }

    static boolean triviaQuestions ()
    {
        // didWin starts off as true
        boolean didWin = true;

        // Bowser starts off with 5 lives
        int bowserLives = 5;

        // While Bowser has greater than 0 lives
        while (bowserLives > 0)
        {
            // Ask Question One
            System.out.println ("Question One: Where were Mario and Luigi born?");
            System.out.println ("a) Mushroom Kingdom");
            System.out.println ("b) New York City");
            System.out.println ("c) Italy");
            System.out.println ("");

            // Ask the user for the answer
            String questionOne = IBIO.inputString ("Enter a letter: ");
            System.out.println ("");

            // Establish the correct answer
            String answerOne = "a";

            // While the user's answer is not valid, keep asking
            while ((!(questionOne.equalsIgnoreCase("a"))) && (!(questionOne.equalsIgnoreCase("b"))) && (!(questionOne.equalsIgnoreCase("c"))))
            {
                System.out.println ("That is not a valid choice.");
                questionOne = IBIO.inputString ("Enter a letter: ");
                System.out.println ("");
            }

            // If the user answered incorrectly
            if (!(questionOne.equalsIgnoreCase(answerOne)))
            {
                // Set didWin to false and return didWin
                didWin = false;
                return didWin;                
            }

            // If the user answered correctly, let them know and print Bowser's remaining lives
            else
            {
                System.out.println ("Correct!");
                bowserLives -= 1;
                System.out.println ("Bowser has " + bowserLives + " lives left.");
                System.out.println ("");
            }

            // Ask question two
            System.out.println ("Question Two: Where was the Warp Whistle in Super Mario 3 originally from?");
            System.out.println ("a) Super Mario 3");
            System.out.println ("b) Legend of Zelda");
            System.out.println ("c) MarioKart");
            System.out.println ("");

            // Ask the user for the answer
            String questionTwo = IBIO.inputString ("Enter a letter: ");
            System.out.println ("");

            // Establish the correct answer
            String answerTwo = "b";

            // While the user's answer is not valid, keep asking
            while ((!(questionTwo.equalsIgnoreCase("a"))) && (!(questionTwo.equalsIgnoreCase("b"))) && (!(questionTwo.equalsIgnoreCase("c"))))
            {
                System.out.println ("That is not a valid choice.");
                questionTwo = IBIO.inputString ("Enter a letter: ");
                System.out.println ("");
            }

            // If the user answered incorrectly
            if (!(questionTwo.equalsIgnoreCase(answerTwo)))
            {
                didWin = false;
                return didWin;                
            }

            // If the user answered correctly, let them know and print Bowser's remaining lives
            else
            {
                System.out.println ("Correct!");
                bowserLives -= 1;
                System.out.println ("Bowser has " + bowserLives + " lives left.");
                System.out.println ("");
            }

            // Ask question three
            System.out.println ("Question Three: In which game did Mario first appear?");
            System.out.println ("a) Super Mario Brother");
            System.out.println ("b) Legend of Zelda");
            System.out.println ("c) Donkey Kong");
            System.out.println ("");

            // Ask the user for the answer
            String questionThree = IBIO.inputString ("Enter a letter: ");
            System.out.println ("");

            // Establish the correct answer
            String answerThree = "c";

            // While the user's answer is not valid, keep asking
            while ((!(questionThree.equalsIgnoreCase("a"))) && (!(questionThree.equalsIgnoreCase("b"))) && (!(questionThree.equalsIgnoreCase("c"))))
            {
                System.out.println ("That is not a valid choice.");
                questionThree = IBIO.inputString ("Enter a letter: ");
                System.out.println ("");
            }

            // If the user answered incorrectly
            if (!(questionThree.equalsIgnoreCase(answerThree)))
            {
                didWin = false;
                return didWin;                
            }

            // If the user answered correctly, let them know and print Bowser's remaining lives
            else
            {
                System.out.println ("Correct!");
                bowserLives -= 1;
                System.out.println ("Bowser has " + bowserLives + " lives left.");
                System.out.println ("");
            }

            // Ask question four
            System.out.println ("Question Four: Mario's first 3D platformer game is?");
            System.out.println ("a) Super Mario 64");
            System.out.println ("b) Mario Paint");
            System.out.println ("c) Super Mario Sunshine");
            System.out.println ("");

            // Ask the user for the answer
            String questionFour = IBIO.inputString ("Enter a letter: ");
            System.out.println ("");

            // Establish the correct answer
            String answerFour = "a";

            // While the user's answer is not valid, keep asking
            while ((!(questionFour.equalsIgnoreCase("a"))) && (!(questionFour.equalsIgnoreCase("b"))) && (!(questionFour.equalsIgnoreCase("c"))))
            {
                System.out.println ("That is not a valid choice.");
                questionFour = IBIO.inputString ("Enter a letter: ");
                System.out.println ("");
            }

            // If the user answered incorrectly
            if (!(questionFour.equalsIgnoreCase(answerFour)))
            {
                didWin = false;
                return didWin;                
            }

            // If the user answered correctly, let them know and print Bowser's remaining lives
            else
            {
                System.out.println ("Correct!");
                bowserLives -= 1;
                System.out.println ("Bowser has " + bowserLives + " lives left.");
                System.out.println ("");
            }

            // Ask question five
            System.out.println ("Question Five: What year was I (Bowser) created?");
            System.out.println ("a) 1985");
            System.out.println ("b) 1982");
            System.out.println ("c) 1984");
            System.out.println ("");

            // Ask the user for the answer
            String questionFive = IBIO.inputString ("Enter a letter: ");
            System.out.println ("");

            // Establish the correct answer
            String answerFive = "a";

            // While the user's answer is not valid, keep asking
            while ((!(questionFive.equalsIgnoreCase("a"))) && (!(questionFive.equalsIgnoreCase("b"))) && (!(questionFive.equalsIgnoreCase("c"))))
            {
                System.out.println ("That is not a valid choice.");
                questionFive = IBIO.inputString ("Enter a letter: ");
                System.out.println ("");
            }

            // If the user answered incorrectly
            if (!(questionFive.equalsIgnoreCase(answerFive)))
            {
                didWin = false;
                return didWin;                
            }

            // If the user answered correctly, let them know and print Bowser's remaining lives
            else
            {
                System.out.println ("Correct!");
                bowserLives -= 1;
                System.out.println ("Bowser has " + bowserLives + " lives left.");
                System.out.println ("");
            }

        }

        // If the user defeated Bowser (i.e. answered five questions correctly), let the user know
        System.out.println ("");
        System.out.println ("You defeated Bowser!");
        System.out.println ("");

        // Return didWin (it will be true)
        return didWin;

    }    
}
