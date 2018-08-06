mport java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) 
    {
        int i,j;
        int sum =0, max =0, i1 =0, i2=3, j1 =0 ,j2 =3,k=0;
        while(i2 <= 6)
        {
            for(i=i1;i<i2;i++)
            {
                for(j=j1;j<j2;j++)
                {
                    if(((j == j2-3) || (j == j2-1)) && (i == ((int)(i1+i2)/2)))
                        continue;
                    else
                        sum = sum + arr[i][j];
                }
            }
            if(j2<=6) {
                j1++;
                j2++;
            }
            if(j2>6)
            {
                i1++;
                i2++;
                j1=0;
                j2=3;
            }
            if(i1 == 0 && sum < 0 && k==0)
            {
                max = sum;
                k++;
            }
            else
            {
                if(sum > max)
                max = sum;
            }
            System.out.println(""+sum);
            sum =0;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
