/**
 * A class to print the corresponding string to the number 1 to the given number.
 *
 * @author Phuc Nguyen
 */
public class Nodes {
    /** Method to print out the corresponding strings to the numbers from 1 to n (inclusive), space separated, "Router" for numbers 3 and 12,
     * "Client" for odd numbers and "Server" for even numbers.
     *
     * @param n a positive number
     */
    public void printCorrespondingStrings(int n) {
        // run for loop with i from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            // if "i" equals to 3 or 12, print "router"
            if (i == 3 || i == 12) {
                System.out.print("Router");
            }
            // if "i" is odd, print "client"
            else if (i % 2 == 1) {
                System.out.print("Client");
            }
            // if "i" is even, print "server"
            else {
                System.out.print("Server");
            }
        }
    }


    public static void main(String[] args) {
        /**
         * Throw IllegalArgumentException if the command line argument is missing, if the argument is not a positive number, or if too many arguments are given. Otherwise, use the given number to call the method printCorrectRespondingStrings above.
         * @throws IllegalArgumentException if the command line argument is missing, if the argument is not a positive number, or if too many arguments are given.
         */
        try {
            // If there are too many arguments given, throw IllegalArgumentException
            if (args.length > 1) {
                throw new IllegalArgumentException("One positive number required as a command line argument.\nExample Usage: java Nodes [number]");
            } else if (args.length == 0) {
                System.out.println("One positive number required as a command line argument.\nExample Usage: java Nodes [number]");
                System.exit(0);
            } else {
                // If the given number is not an integer, throw NumberFormatException
                int number = Integer.parseInt(args[0]);

                // If the given number is smaller than 0, throw IllegalArgumentException
                if (number <= 0) {
                    throw new IllegalArgumentException("One positive number required as a command line argument.\nExample Usage: java Nodes [number]");
                } else {
                    {
                        Nodes node1 = new Nodes();
                        //node1.printCorrespondingStrings(args[0]);
                        node1.printCorrespondingStrings(number);
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("One positive number required as a command line argument.\nExample Usage: java Nodes [number]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
