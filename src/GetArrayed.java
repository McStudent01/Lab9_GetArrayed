import java.util.Scanner;
import java.util.Random;

public class GetArrayed
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random generator = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            int value = generator.nextInt(100);
            while (value == 0) {
                value = generator.nextInt(100);
            }
            dataPoints[i] = value;
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.printf("%3d | ", dataPoints[i]);
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = sum / dataPoints.length;

        System.out.println("The sum of the random array is: " + sum);
        System.out.println("The average of the random array is: " + average);

        Scanner in = new Scanner(System.in);

        int userInput = SafeInput.getRangedInt(in, "Enter a number between: ", 1, 100);

        int count = 0;
        int index = 0;
        String locations = "";

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userInput)
            {
                count++;
                index = i;
                locations += " " + index;
            }
        }

        if (count > 0)
        {
            System.out.println("The number you entered, " + userInput + " , was found " + count + " times in the array, at the array index(s) of" + locations);
        } else
        {
            System.out.println("The value " + userInput + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            } else if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value is: " + min + " and the maximum value is: " + max);
        System.out.printf("Average of the array is: %.2f\n", average);
    }
    public static double getAverage(double[] dataPoints)
    {
        double sum = 0.0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += (double) dataPoints[i];
        }

        return sum / dataPoints.length;
    }
}