//Not yet completed
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int k, count =0;
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
          int temp;
        for(int i =0;i< q.length; i++)
        {
            for(int j =0;j< q.length ;j++)
            {
                if(q[j] == q.length-i)
                {
                    k = j;
                }
            }
            for(int j = k;j<k+2 ; j++)
            {
                if(q[j] == j+1)
                {
                    break;
                }
                else
                {
                    temp = q[j];
                    q[j] = q[j+1];
                    q[j+1] = temp;
                    count++;
                }
            }
        }
        for(int i =0;i<q.length;i++)
        {
            if(q[i] == i+1)
            {
                continue;
            }
            else
            {
                System.out.println("Too Chaotic");
                return;
            }
        }
        return;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
