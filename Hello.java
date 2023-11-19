package Sai_Java;

import java.lang.Package;
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

        int x = 7;
        int y = 5;
        int b = 5;
        int c = 9;
        boolean result2 = x>y && b>c ;
        System.out.println(result2);
        boolean result3 = x>y || c>b ;
        System.out.println(result3);
    }
}