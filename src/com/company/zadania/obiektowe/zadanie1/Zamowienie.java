package com.company.zadania.obiektowe.zadanie1;

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
        for (int i = 0; i < pozycja.length; i++) {
            if(pozycja[i]==null) break;
            wartoscZamowienia += pozycja[i].obliczWartosc();
        }
        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        StringBuilder helper = new StringBuilder();
        for (Pozycja value : pozycja) {
            if (value == null) break;
            helper.append(value);
            helper.append("\n");
        }
        System.out.println();
        return "Zamówienie" + "\n" + helper + "Razem: " + obliczWartosc();
    }
}