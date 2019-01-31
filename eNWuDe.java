package SPOJ;

import java.util.Scanner;

public class eNWuDe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //x liczba testow
        int result=-1;
        int a;
        int b;
        String nic;
        for(int i = 0; i < x; i++)
        {

            a = scanner.nextInt();
            b = scanner.nextInt();
            result = nwd(a, b);
            System.out.println(result);
        }



    }
    static int nwd(int a, int b)
    {
    int r = -1;
        while(b!=0)
        {
            r = a%b;
            a = b;
            b = r;
        }

    return a;
    }
}
