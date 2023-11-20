package Sai_Java;

import java.lang.Package;

import javax.lang.model.util.ElementScanner14;
class Hello
{
    public static void main(String a[])
    {   
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2 ;
        System.out.println(result);

        num1++;
        System.out.println(num1);
        ++num1;
        System.out.println(num1);

        boolean result1 = num1 != num2;
        System.out.println(result1);
    // # check boolean        
        int x = 7;
        int y = 5;
        int b = 5;
        int c = 9;
        boolean result2 = x>y && b>c ;
        System.out.println(result2);
        boolean result3 = x>y || c>b ;
        System.out.println(result3);
        
        if(x>y && x>c)
            System.out.println(x);
        else if(y>c)
            System.out.println(y);
        else
            System.out.println(c);

        int n = 3;
        if(n==1)
            System.out.println("Sunday");
        else if (n==2)
            System.out.println("Monday");
        else if (n==3)
            System.out.println("Tuesday");
        else if (n==4)
            System.out.println("Wednesday");
        else if (n==5)
            System.out.println("Thursday");
        else if (n==6)
            System.out.println("Friday");
        else 
            System.out.println("Saturday");
        
        System.out.println("@@@@@@@@@test switch starts@@@@@@@@@");
        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7: 
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter valid number");
        }    
        System.out.println("@@@@@@@@@ While @@@@@@@@@");

        int i = 1;
        while (i<=4)
        {
            System.out.println("Hiii " + i);
            int j = 1;
            while (j <=3)
            {
                System.out.println("Hello " + j);
                j++;
            }

            i++;
        }
        System.out.println("@@@@@@@@@@@ Do While @@@@@@@@@@@");

        int k = 5;
        do
        {
            System.out.println("do HI " + k);
            k++;
        }while(i<=4);
        
        System.out.println("@@@@@@@@@@@ for @@@@@@@@@@@");

        for (int ii=1; ii<=5; ii++)
        {
            System.out.println("Day " + ii);

            for (int j=1; j<=9; j++)
            {
                System.out.println("   " + (j+8) + " - " + (j+9));
            }
        }

     }
}