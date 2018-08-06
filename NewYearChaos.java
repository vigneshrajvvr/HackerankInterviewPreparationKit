import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
static int k, count1 =0;
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int temp;
        int count[] = new int[q.length];
        for(int i=0;i<q.length;i++)
        {
            for(int j =0;j <q.length; j++)
            {
                if(q[j] == i+1)
                {
                    k = j;
                    break;
                }
            }
            for(int j =k; j> k-2;j--)
            {
                if(q[j] == j+1)
                {
                    break;
                }
                else
                {
                    temp = q[j];
                    q[j] = q[j-1];
                    q[j-1] = temp;
                    count[j]++;
                    count[j-1]++;
                    count1++;
                    if(count[j] >3 || count[j-1] >3)
                    {
                        System.out.println("Too chaotic");
                        System.exit(0);
                    }
                }
            }
        }
        for(int i =0;i<q.length;i++)
        {
            if(q[i] == i+1)
            {
                continue;
            }
            else{
                System.out.println("Too chaotic");
                System.exit(0);
            }
        }
        System.out.println(""+count1);
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
