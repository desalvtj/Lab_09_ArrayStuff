import java.util.Scanner;
import java.util.Random;

public class Main
{
    static int[] dataPoints = new int[100];
    static double avg = 0;
    static double sum = 0;

    public static double getAverage(int values[])
    {
       double sum = 0;
       for (int value : values)
       {
           sum += value;
       }
       return sum / values.length;
    }


    public static void main(String[] args)
    {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int count = 0;
        int foundLocus = -1;



        for(int d = 0; d < dataPoints.length; d++)
        {
            dataPoints[d] = gen.nextInt(100) + 1;
        }
        System.out.println();

        for(int d = 0; d < dataPoints.length; d++)
        {
            System.out.print(dataPoints[d] + " | ");
        }
        System.out.println();

        for(int d = 0; d < dataPoints.length; d++)
        {
            sum += dataPoints[d];
            avg = sum / dataPoints.length;
        }
        System.out.println("The sum is " + sum + " and the average is " + avg);


        int target = SafeInput.getRangedInt(in, "Input number between 1 and 100", 1, 100);

        for(int d = 0; d < dataPoints.length; d++)
        {
            if(dataPoints[d] == target)
            {
            count++;}

        }

        if(count > 0)
        {
            System.out.println("The value " + target + " was found " + count + " times in the array.");
        }else {
            System.out.println("The value " + target + " was not found.");
        }


        for (int d = 0; d < dataPoints.length; d++)
        {
            if(dataPoints[d] == target)
            {
                foundLocus = d;
                break;

            }

        }
        if(foundLocus != -1)
        {
            System.out.println("The value " + target + " was found at locus " + foundLocus + ".");

        }
        else {
            System.out.println("Did not find target " + target);
        }

       double maxVal = dataPoints[0];
       double minVal = dataPoints[0];

        for(int d = 1; d < dataPoints.length; d++)
        {
            if(dataPoints[d] > maxVal)
            {
                maxVal = dataPoints[d];

            }
            if(dataPoints[d] < minVal)
            {
                minVal = dataPoints[d];

            }

        }
        System.out.println("The max value is " + maxVal + " and the min value is " + minVal);


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }




}
