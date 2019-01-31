package SPOJ;

import java.util.Scanner;

public class tablice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        //t to liczba testów
        int x =0;
        int y =0;
        for(int i = 0; i < t; i++)
        {
            x = scanner.nextInt();
            int[] tab = new int[x];
            for(int j = 0; j < x; j++)
            {
               tab[j] = scanner.nextInt();
            }
            for(int j = x-1; (j)>=0; j--)
            {
                System.out.print(tab[j]+ " ");
            }
            System.out.println();

        }
    }
}
