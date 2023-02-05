import java.util.*;

public class palindromeNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int a = num;
        int rev = 0;
        while(num>0)
        {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        if(rev == a)
        {
            System.out.println("it is a palindrome number");
        }
        else
        {
            System.out.println("it is not a palindome number");
        }
    }
    
}

