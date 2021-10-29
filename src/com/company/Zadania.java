package com.company;

import java.util.Scanner;

public class Zadania {
    Scanner scanner = new Scanner(System.in);


    // Napisać program służący do konwersji wartości temperatury podanej w stopniach
    //Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
    //Celsjusza + 32.0)
    public void Zadanie1(){
        double degreesC;
        System.out.println("To jest aplikacja do przeliczania temp. Celcjusza na stopnie w skali Fahrenheita");
        System.out.println("Podaj wartośc temperatury w stopniach Celcjusza:");
        degreesC = scanner.nextInt();
        double degreesF = degreesC*1.8+32;

        System.out.println(degreesC + " stC równe jest " + degreesF + " stopni Fahrenheita");
    }
    //Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
    //najmniejszą z nich.
    public void Zadanie2(){
        int[] tab = new int[3];
        int zmiana=1;
        int temp;

        for (int j=0;j<tab.length;++j)
        {
            System.out.println("Podaj liczbę całkowita nr "+ (j+1) + ":");
            tab[j]=scanner.nextInt();
        }

        while (zmiana >0){
            zmiana=0;
            for (int i=0;i<tab.length-1;++i)
            {
             if(tab[i+1]>tab[i])
             {
                 temp=tab[i];
                 tab[i]=tab[i+1];
                 tab[i+1]=temp;
                 zmiana++;
             }
            }
           }
        for (int k=0;k<tab.length;++k)
        {
            System.out.print(tab[k]+" ");

        }
    }

}
