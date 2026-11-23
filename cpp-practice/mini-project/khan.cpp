#include <iostream>     // Includes input-output stream for cin and cout
#include <ctime>        // Includes time library to generate random numbers based on system time
using namespace std;    // Avoids the need to prefix std:: for standard functions and types

int main() {
    int num, guess, difficulty;      // Variables for the random number, the user's guess, and difficulty level
    int tries = 0;                   // Tracks how many guesses the player has made
    int maxtries = 7;               // Maximum allowed number of guesses

    srand(time(NULL));              // Seeds the random number generator using the current time

    // Display the game menu
    cout << "******** NUMBER GUESSING GAME ********" << endl;
    cout << "Choose difficulty level" << endl;
    cout << " 1: Easy Mode (1-100) in 7 tries" << endl;
    cout << " 2: Medium Mode (1-200) in 7 tries" << endl;
    cout << " 3: Hard Mode (1-500) in 7 tries" << endl;
    cout << "Enter your choose (1-3) :";   // Ask the user to choose a difficulty
    cin >> difficulty;                     // Store the user's input

    // Generate the random number based on difficulty level
    switch (difficulty) {
        case 1:
            num = (rand() % 100) + 1;      // Random number between 1 and 100
            break;
        case 2:
            num = (rand() % 200) + 1;      // Random number between 1 and 200
            break;
        case 3:
            num = (rand() % 500) + 1;      // Random number between 1 and 500
            break;
        default:
            cout << "Invalid choice! choose by default to Easy Mode" << endl; // Fallback if input is invalid
            num = (rand() % 100) + 1;      // Default to 1-100
            break;
    }

    // Easy mode guessing logic
    if (difficulty == 1) {
        do {
            if (tries < maxtries) {
                cout << "Guess a Number between (1-100) to answer:";  // Prompt user
                cin >> guess;            // Read user's guess
                tries++;                 // Increase tries count

                if (guess > num) {
                    cout << "Too high" << endl;   // If guess is too high
                } else if (guess < num) {
                    cout << "Too Low" << endl;    // If guess is too low
                } else {
                    cout << "CORRECT! you guessed it in " << tries << " tries " << endl; // Correct guess
                    break;    // Exit loop
                }

                cout << "You have " << (maxtries - tries) << " tries left." << endl; // Show remaining tries
            } else {
                cout << "\n Sorry! You've used all your tries. The number was " << num << "." << endl;
                break;  // Game over
            }
        } while (guess != num);   // Continue until correct guess
    }

    // Medium mode guessing logic
    else if (difficulty == 2) {
        do {
            if (tries < maxtries) {
                cout << "Guess a Number between (1-200) to answer:"; // Prompt user
                cin >> guess;           // Read guess
                tries++;                // Count the guess

                if (guess > num) {
                    cout << "Too high" << endl; // Too high
                } else if (guess < num) {
                    cout << "Too Low" << endl;  // Too low
                } else {
                    cout << "CORRECT! you guessed it in " << tries << " tries " << endl; // Correct
                    break;
                }

                cout << "You have " << (maxtries - tries) << " tries left." << endl; // Remaining tries
            } else {
                cout << "\n Sorry! You've used all your tries. The number was " << num << "." << endl;
                break; // Out of tries
            }
        } while (guess != num);  // Continue guessing
    }

    // Hard mode guessing logic
    else if (difficulty == 3) {
        do {
            if (tries < maxtries) {
                cout << "Guess a Number between (1-500) to answer:";  // Prompt
                cin >> guess;          // Read guess
                tries++;               // Count attempt

                if (guess > num) {
                    cout << "Too high" << endl;
                } else if (guess < num) {
                    cout << "Too Low" << endl;
                } else {
                    cout << "CORRECT! you guessed it in " << tries << " tries " << endl;
                    break; // Correct guess
                }

                cout << "You have " << (maxtries - tries) << " tries left." << endl;
            } else {
                cout << "\n Sorry! You've used all your tries. The number was " << num << "." << endl;
                break; // All tries used
            }
        } while (guess != num); // Continue until correct
    }

    // Fallback guessing logic in case of invalid difficulty
    else {
        do {
            if (tries < maxtries) {
                cout << "Guess a Number between (1-100) to answer:"; // Default fallback
                cin >> guess;
                tries++;

                if (guess > num) {
                    cout << "Too high" << endl;
                } else if (guess < num) {
                    cout << "Too Low" << endl;
                } else {
                    cout << "CORRECT! you guessed it in " << tries << " tries " << endl;
                    break; // Guessed correctly
                }

                cout << "You have " << (maxtries - tries) << " tries left." << endl;
            } else {
                cout << "\n Sorry! You've used all your tries. The number was " << num << "." << endl;
                break; // Out of tries
            }
        } while (guess != num);  // Loop until guessed
    }

    return 0;   // End of main function and program
}
