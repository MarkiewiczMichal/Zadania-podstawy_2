package com.company.zadania.obiektowe.zadanie1;

import java.util.Objects;
import java.util.Scanner;

public class Zamowienie {

    public Zamowienie() {
        maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycja = new Pozycja[maksRozmiar];
    }

    private int maksRozmiar;
    private Pozycja[] pozycja;
    private int ileDodanych = 0;

    public void dodajPozycje(Pozycja p) {
        pozycja[ileDodanych] = p;
        ileDodanych++;
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (Pozycja value : pozycja) {
            if (value == null) continue;
            wartoscZamowienia += value.obliczWartosc();
        }
        return wartoscZamowienia;
    }

    public void usunPozycje(int indeks) {
        try {
            pozycja[indeks] = null;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    public void edytujPozycje(int indeks) {
        Scanner scanner = new Scanner((System.in));
        String nazwaTowaru;
        int ileSztuk;
        double cena;
        try {
            if (pozycja[indeks] != null) {
                System.out.println("Podaj nową nazwę towaru");
                nazwaTowaru = scanner.next();
                System.out.println("Podaj ilość sztuk");
                ileSztuk = scanner.nextInt();
                System.out.println("Podaj nową cenę");
                cena = scanner.nextDouble();
                pozycja[indeks] = new Pozycja(nazwaTowaru, ileSztuk, cena);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }

    }


    @Override
    public String toString() {
        StringBuilder helper = new StringBuilder();
        for (Pozycja value : pozycja) {
            if (value == null) continue;
            helper.append(value);
            helper.append("\n");
        }
        System.out.println();
        return "Zamówienie: " + "\n" + helper + "Razem: " + obliczWartosc();
    }
}