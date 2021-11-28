package com.company.zadania.obiektowe.zadanie1;

public class Pozycja {
    //Klasa Pozycja powinna zawierać następujące pola:
    //• nazwaTowaru (String)
    //• ileSztuk (int) – liczba zamówionych sztuk
    //• cena (double) – cena pojedynczej sztuki
    //oraz metody:
    //• konstruktor z parametrami umożliwiającymi ustalenie wartości pól klasy,
    //• metodę double obliczWartosc() zwracającą wartość pozycji zamówienia,
    //• metodę String toString() zwracającą łańcuch w formacie: nazwa towaru
    //(20 znaków), cena (10 znaków), liczba sztuk (4 znaki), wartość zamówienia
    //(10 znaków), przykład:
    //Cukier 4,00 zł 3 szt. 12,00 zł

    private final String nazwaTowaru;
    private int ileSztuk;
    private final double cena;

    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        return cena * ileSztuk;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk += ileSztuk;
    }

    public int getIleSztuk(){
        return ileSztuk;
    }

    @Override
    public String toString() {
        return nazwaTowaru + " " + cena + " zł " + ileSztuk + " szt. " + obliczWartosc() + " zł";
    }
}

