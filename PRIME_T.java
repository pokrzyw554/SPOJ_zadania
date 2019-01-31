package SPOJ;

import java.util.Scanner;

public class PRIME_T
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean[] tab = new boolean[100000];   //tworze sito
        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = true;
        }               //zakonczono tworzenie sita
        tab[0] = false;
        tab[1] = false;
        for(int i = 2; i*i <= tab.length; i++)
        {
            if(tab[i])
            {
                for(int j=i*i ; j<tab.length; j+=i)   //zmieniles i na j
                {
                    tab[j] = false;     //tutaj tez zamieniles i na j
                }
            }
        }

        int n = scanner.nextInt();
        int liczb;
        for(int i = 0; i < n; i++)
        {
            liczb = scanner.nextInt();
            if(sprawdzSitem(liczb, tab))
            {
                System.out.println("TAK");
            }else
            {
                System.out.println("NIE");
            }
        }
    }
     static boolean sprawdzSitem(int n, boolean[] tab)
    {
               //stworzono
      //do tej klamry działą
        //masz jebniete sito prawidłowo
  /*      for(int i = 0; i <tab.length; i++)
        {
            System.out.println(tab[i]);
        }*/
        return tab[n];

    }

}
