package SPOJ;

import java.util.Scanner;

public class flamaster
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t;
        t =  scanner.nextInt();
        boolean dubel = false;
        for(int i = 0; i < t+1; i++)      //sprawdzamy t razy
        {

         String wyraz = scanner.nextLine();
         char poprz = '+';              //powiedzmy że już dobrze pobiera
            for(int j = 0; j < wyraz.length(); j++) //analizujesz każdy wyraz
            {
                if(j<wyraz.length()-2)  //if czy for?
                {
                    if(wyraz.charAt(j)==wyraz.charAt(j+1)&&wyraz.charAt(j+2)==wyraz.charAt(j))
                    {
                     //zaczynamy liczyć
                        int licznik = 1;
                        int x =j;
                        do
                        {
                            licznik++;
                            x++;
                            if(j+licznik==wyraz.length())
                            {
                            /*    System.out.print(wyraz.charAt(j));
                                System.out.print(licznik);*/
                                break;  //ciekawe jak sie wyjebie
                            }
                        }while(wyraz.charAt(x)==wyraz.charAt(x+1));
//                        System.out.println("mamy tripla!");
                        System.out.print(wyraz.charAt(j));
                        System.out.print(licznik);
                        j+=licznik-1;
                        //nie no, ale tutaj go countuj jak jest triple
                    }
                    else
                    {
                        System.out.print((wyraz.charAt(j)));
                    }

                }
                else
                {
                    System.out.print(wyraz.charAt(j));
                }
                           //todo wez to wszystko w pizdu przebuduj

            }
            System.out.println();
        }
    }
}
