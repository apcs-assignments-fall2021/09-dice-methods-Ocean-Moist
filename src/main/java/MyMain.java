public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) (Math.random()*6 + 1);
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        int x = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 6; j++) {
                if (rollDie() == 6) {
                    x++;
                    break;
                }
            }
        }

        return x/100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int y = 0;
        int x = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 12; j++) {
                if (rollDie() == 6) {
                    y++;
                }
            }
            if (y >= 2) {
                x++;
            }
            y = 0;
        }
        return x/100;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int x = 0;
        for (int i = 0; i < 10000; i++) {
            int y = 0;
            for (int j = 0; j < 18; j++) {
                if (rollDie() == 6) {
                    y++;
                }
            }
            if (y >= 3) {
                x++;
            }
        }

        return x/100;
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
