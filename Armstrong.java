import java.lang.*;

public class Armstrong
{
    public static void main(String args[])
    {
        int sum = 0;
        for (int i=10000;i<=99999;i++)
            if (isArmstrongNumber(i)){
                sum += i;
            }
        System.out.println("sum : " + sum);
    }

    public static boolean isArmstrongNumber(int ANumb)
    {
        int start = ANumb;
        int result=0;
        int tmp=0;
        int count=5;

        while (ANumb != 0) {
            tmp = ANumb%10;
            result = result +((int) Math.pow(tmp, count));
            ANumb = ANumb/10;
        }

        if (result == start)
            return true;

        return false;
    }
}