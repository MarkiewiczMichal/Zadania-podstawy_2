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
        int x,y,z;
        int min =Integer.MAX_VALUE;
        System.out.println("To jest program do sortowania liczb całkowitych");
        System.out.println("Podaj liczbę całkowita nr 1:");
        x=scanner.nextInt();
        System.out.println("Podaj liczbę całkowita nr 2:");
        y=scanner.nextInt();
        System.out.println("Podaj liczbę całkowita nr 3:");
        z=scanner.nextInt();

        if (x<min)
        {
           min=x;
        }


    }

}
