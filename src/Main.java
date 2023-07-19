import java.util.Scanner;
import java.util.Random;

public class Main
{

    public static void main(String[] args) {
        // Declare an array of type int named dataPoints.
        int[] dataPoints = new int[100];

        // Initialize a Random object.
        Random generator = new Random();

        // Code a regular for loop that iterates through the dataPoints array and initializes each element in it to a generator value between 1 and 100.
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = generator.nextInt(101);
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%3d | ", dataPoints[i]);
        }
        System.out.println();

        // Code a loop that calculates the sum and the average of the values in dataPoints.
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = sum / dataPoints.length;

        System.out.println("The sum of the random array is: " + sum);
        System.out.println("The average of the random array is: " + average);

        // Create a Scanner object.
        Scanner in = new Scanner(System.in);

        // Prompt and input an int value between 1 and 100 from the user.
        int userInput = SafeInput.getRangedInt(in, "Enter a number between: ", 1, 100);

        // Initialize a counter to keep track of the number of times the value was found.
        int count = 0;
        int index = 0;
        String locations = "";

        // Iterate through the dataPoints array and check each value to see if it matches the one the user input.
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                // The value was found, so increment the counter and set the index.
                count++;
                index = i;
                locations += " " + index;
            }
        }

        // Check the count variable and print out the appropriate message.
        if (count > 0) {
            System.out.println("The number you entered, " + userInput + " , was found " + count + " times in the array, at the array index(s) of" + locations);
        } else {
            System.out.println("The value " + userInput + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        // Iterate through the dataPoints array and update the minimum and maximum values if necessary.
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            } else if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value is: " + min + " and the maximum value is: " + max);
    }
}