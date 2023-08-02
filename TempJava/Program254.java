// Accept numbers and display common factors

import java.util.*;

public class Program254
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Please enter second number : ");
        int iNo2 = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.CommonFactorsDisplay(iNo1,iNo2);
    }
}

class Numbers
{
    public void CommonFactorsDisplay(int iNo1, int iNo2)
    {
        int iCnt = 0;

        System.out.println("Common factors are : ");

        for(iCnt = 1; (iCnt <= iNo1/2) && (iCnt <= iNo2/2);iCnt++)
        {
            if(((iNo1 % iCnt )==0) && ((iNo2 % iCnt) == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}
