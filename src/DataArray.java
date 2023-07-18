import java.util.Random;

public class DataArray
{

    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];

        Random generator = new Random();


        for (int d = 0; d < dataPoints.length; d++)
        {
            dataPoints[d] = generator.nextInt(101);
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
    }
}