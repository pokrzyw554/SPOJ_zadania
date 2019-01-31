package SPOJ;

import java.util.Scanner;

public class kalkulator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        char znak;
        int a;
        int b;
        String pomocniczy;
        while(scanner.hasNext())
        {
           pomocniczy = scanner.next(); //ojeb Stringa na znak + liczby
           znak = pomocniczy.charAt(0);
           a = scanner.nextInt();
           b = scanner.nextInt();
           switch(znak)
           {
               case '+' :
                   System.out.println(a+b);
                   break;
               case '-' :
                   System.out.println(a-b);
                   break;
               case '*' :
                   System.out.println(a*b);
                   break;
               case '/' :
                   System.out.println(a/b);
                   break;
               case '%' :
                   System.out.println(a%b);
                   break;
           }

        }
    }
}
