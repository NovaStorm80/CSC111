
package bear;

// import java Scanner
import java.util.Scanner;

public class Bear {
    
    /* Zach, in this example, I used two functions:

        setGoal() will caculate the goal, based on user input.
        bearGoal() is the recursive function you needed.

    To finish this project, you will need to implement a counter that will keep track of how
    many tries the user makes (4 tries in this example). Hope this helps!
    */

    
    // Recursive Method
    public static int bearGoal(int bears, int goal) {
        
        String userChoice; // variable that holds the user's input
        
        // activate scanner for keyboard input
        Scanner input = new Scanner(System.in);
        
        // if the number of bears meet the goal
        if(bears == goal) {
            return 1;
        
        // if the number of bears did not meet the goal
        } else {
            
            // update user on the amount of bears he/she has
            System.out.println("\nYou have " + bears + " bears. What do you want to do? ");
            
            // ask the user what he/she wants to do next
            
            // subtracts 8 bears
            System.out.println("\nIf you want to subtract 8 bears, press 's'");
            
            // adds 5 bears
            System.out.println("\nIf you want to add 5 bears, press 'a'");
            
            // if the amount of bears is an even number, offer an option to remove half of them
            if ( (bears % 2) == 0) {
                System.out.println("\nLooks like you have an even number. Do you want to reduce"
                        + " the amount of bears you have in half? Press 'h'.");
            }
            
            // receives user input
            userChoice = input.next();
            
            // checks to see if the user has inputted an 's', 'a' or 'h'. If not, output an error.
            switch (userChoice) {
                case "s":
                case "S":
                    // subtract bears by 8
                    bears = bears - 8;
                break;
                
                case "a":
                case "A":
                    // add 5 bears
                    bears = bears + 5;
                break;
                
                case "h":
                case "H":
                    // divide bears by 2
                    bears = bears / 2;
                break;
            }
            
            // make the function call itself again, but with a new bear value
            return bearGoal(bears, goal);
        }
    }
    
    // a function that generates the goal of bears
    public static int getGoal (int val) {
        
        // set goal by subtracting 12 from the initNbrOfBears value
        int goal = val - 12;
        
        // return the goal
        return goal;
    }
    
    public static void main(String[] args) {
        
        // declare variables        
        int nbrOfBears; // initial number of bears played in this game
        
        // activate scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for number of bears they wish to begin with
        System.out.println("Please enter the amount of bears you wish to begin with: ");
        nbrOfBears = keyboard.nextInt();
        
        System.out.println("You have " + nbrOfBears + " bears. Your goal is "
                + "to reach " + getGoal(nbrOfBears) + " bears in less than 4 steps." );
        
        // final variable that will hold the goal fixed just for this round
        final int GOAL = getGoal(nbrOfBears);
        
        // using the recursive function for the game
        // call the bearGoal method and plug in the arguments
        int x = bearGoal(nbrOfBears, GOAL);
        
        // if statement to check if the return value equals 1
        if (x == 1) {
            System.out.println("YOU WIN!");
        }
        
    }
    
}
