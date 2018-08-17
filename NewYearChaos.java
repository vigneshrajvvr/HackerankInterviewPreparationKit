//Not yet completed
//Terminated due to time out
//For larger inputs this code takes more time
import java.util.*;
public class Main 
{
    static int count =0,k,count1 =0;
    public static void main(String args[])
    {
        int T, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int q[] = new int[n];
        for(int i =0;i<n;i++)
        {
            q[i] = in.nextInt();
        }
        for(int i =0;i<q.length;i++)
        {
            for(int j =0;j<q.length;j++)
            {
                if(q[j] == q.length - i)
                {
                    k =j;
                    break;
                }
            }
            System.out.println(""+k);
            for(int j =k;j<q.length;j++)
            {
                if(q[j] == j+1)
                {
                    break;
                }
                else
                {
                    int temp;
                    count++;
                    if(count == 3)
                    {
                        System.out.println("Too chaotic");
                        System.exit(0);
                    }
                    temp = q[j];
                    q[j] = q[j+1];
                    q[j+1] = temp;
                    count1++;
                }
            }
            System.out.println("count :"+count);
            count =0;
        }
        System.out.println(""+count1);
    }
}
