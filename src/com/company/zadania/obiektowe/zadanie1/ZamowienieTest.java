package com.company.zadania.obiektowe.zadanie1;

public class ZamowienieTest {

    public static void main(String[] args){
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.print(p2);

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z);

        z.usunPozycje(20);
        System.out.println(z);
        z.edytujPozycje(100);
        System.out.println(z);

        Pozycja p3= new Pozycja("Chleb",10,3.5);
        z.dodajPozycje(p3);
        System.out.println(z);
    }
}
