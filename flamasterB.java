package SPOJ;

import java.util.Scanner;

public class flamasterB
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t;
        t =  scanner.nextInt();
        boolean dubel = false;
        for(int i = 0; i < t+1; i++)
        {
         String wyraz = scanner.nextLine();
         char poprz = '+';
            for(int j = 0; j < wyraz.length(); j++)
            {
                if(j<wyraz.length()-2)
                {
                    if(wyraz.charAt(j)==wyraz.charAt(j+1)&&wyraz.charAt(j+2)==wyraz.charAt(j))
                    {
                        int licznik = 1;
                        int x =j;
                        do
                        {
                            licznik++;
                            x++;
                            if(j+licznik==wyraz.length())
                                break;
                        }while(wyraz.charAt(x)==wyraz.charAt(x+1));
                        System.out.print(wyraz.charAt(j));
                        System.out.print(licznik);
                        j+=licznik-1;
                    }
                    else
                        System.out.print((wyraz.charAt(j)));

                }
                else
                {
                    System.out.print(wyraz.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
