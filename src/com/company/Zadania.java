package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Zadania {
    Scanner scanner = new Scanner(System.in);


    // Napisać program służący do konwersji wartości temperatury podanej w stopniach
    //Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
    //Celsjusza + 32.0)
    public void zadanie1() {
        double degreesC;
        System.out.println("To jest aplikacja do przeliczania temp. Celcjusza na stopnie w skali Fahrenheita");
        System.out.println("Podaj wartośc temperatury w stopniach Celcjusza:");
        degreesC = scanner.nextInt();
        double degreesF = degreesC * 1.8 + 32;

        System.out.println(degreesC + " stC równe jest " + degreesF + " stopni Fahrenheita");
    }

    //Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
    //najmniejszą z nich.
    public void zadanie2() {
        int[] tab = new int[3];
        int zmiana = 1;
        int temp;

        for (int j = 0; j < tab.length; ++j) {
            System.out.println("Podaj liczbę całkowita nr " + (j + 1) + ":");
            tab[j] = scanner.nextInt();
        }

        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; ++i) {
                if (tab[i + 1] > tab[i]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    zmiana++;
                }
            }
        }
        for (int k = 0; k < tab.length; ++k) {
            System.out.print(tab[k] + " ");

        }
    }

    //Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
    //index) wg. wzoru: waga /wzrost^2 .
    //Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
    //”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.
    public void zadanie3() {
        double waga, wzrost, BMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją wage w kg");
        waga = scanner.nextDouble();
        System.out.println("Podaj swój wzrost w cm");
        wzrost = scanner.nextDouble();
        BMI = (waga / Math.pow(wzrost / 100, 2));

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Twoja waga jest prawidłowa");
        } else if (BMI < 18.5) {
            System.out.println("Niedowaga !");
        } else {
            System.out.println("Nadwaga !");
        }
        System.out.println("Twój współczynnik BMI wynosi " + Math.round(BMI * 100.0) / 100.0);
        //inny sposób zaokrąglania liczby
        System.out.format("%.2f%n", BMI);
    }

    //Given a string , print Yes if it is a palindrome, print No otherwise.
    //Sample Input
    //madam
    //Sample Output
    //Yes
    public void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo a program sprawdzi czy jest to palindrom");
        String A = scanner.next();
        int counter = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == A.charAt(A.length() - i - 1)) {
                counter++;
            }

        }
        if (counter == A.length()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //Napisać program obliczający należny podatek dochodowy od osób fizycznych.
    // Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
    //należny podatek. Podatek obliczany jest wg. następujących reguł:
    //• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
    //• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
    public void zadanie5() {
        double dochodRoczny, podatek;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Program służy do wyliczenia podatku od dochodu rocznego");
        System.out.println("Podaj swój dochód za ubiegły rok w zł aby wyliczyć podatek");
        dochodRoczny = scaner.nextDouble();

        if (dochodRoczny <= 85528) {
            podatek = dochodRoczny * 0.18 - 556.02;
        } else {
            podatek = 14839.02 + dochodRoczny * 0.32;
        }
        System.out.print("Podatek od kwoty: " + dochodRoczny + " wynosi: ");
        System.out.format("%.2f", podatek);
        System.out.println(" zł");
    }

    //W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program
    //umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi
    //wejściowymi dla programu są:
    //• cena towaru (od 100 zł do 10 tyś. zł),
    //• liczba rat (od 6 do 48).
    //Kredyt jest oprocentowany w zależności od liczby rat:
    //• od 6–12 wynosi 2.5% ,
    //• od 13–24 wynosi 5%,
    //• od 25–48 wynosi 10%.
    //Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien
    //sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w
    //przypadku błędu pytać prosić użytkownika ponownie o podanie danych.
    public void zadanie6() {
        double cenaTowar, rata;
        int liczbaRat;
        System.out.println("Program sluzy do obliczenia raty miesiecznej kredytu");
        System.out.println("W naszym bnku oferujemy kredyty od 100zł do 10tyś zł");
        System.out.println("Podaj prosze ile chcesz kredytu");
        Scanner scanner = new Scanner(System.in);
        cenaTowar = scanner.nextDouble();

        while ((cenaTowar > 10000 || cenaTowar < 100)) {
            System.out.println("Twoja kwota jest z poza zakresu");
            System.out.println("W naszym bnku oferujemy kredyty od 100zł do 10tyś zł");
            cenaTowar = scanner.nextDouble();
        }
        System.out.println("Kredyt jest oprocentowany w zależności od liczby rat:");
        System.out.println("od 6–12 wynosi 2.5% ");
        System.out.println("od 13–24 wynosi 5%");
        System.out.println("od 25–48 wynosi 10%");
        System.out.println("Podaj prosze na ile rat chcesz podzielić spłatę: ");
        liczbaRat = scanner.nextInt();

        while (liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Proszę wybrać liczbę rat od 6 do 48");
            liczbaRat = scanner.nextInt();
        }

        System.out.println("Twoja miesięczna rata kredytu wraz z odsetkami wynosi:");
        if (liczbaRat <= 12) {
            rata = cenaTowar * 1.025 / liczbaRat;
        } else if (liczbaRat <= 24) {
            rata = cenaTowar * 1.05 / liczbaRat;
        } else {
            rata = cenaTowar * 1.10 / liczbaRat;
        }
        System.out.format("%.2f", rata);
        System.out.println(" zł");
    }


    //Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji
    // dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych.
    // Program ma identyfikować sytuację wprowadzenia błędnego
    //symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
    //do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
    //operacji. Scenariusz działania programu:
    //a) Program wyświetla informację o swoim przeznaczeniu.
    //b) Wczytuje pierwszą liczbę.
    //c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
    //d) Wczytuje drugą liczbę.
    //e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
    //f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza Enter.
    public void zadanie7() throws Exception {
        int a, b;
        char z;
        System.out.println("Ten program to prosty kalkulator na liczbach rzeczywistych");
        System.out.println("+ dodawanie");
        System.out.println("- odejmowanie");
        System.out.println("* mnożenie");
        System.out.println("/ dzielenie");

        Scanner scanner = new Scanner(System.in);
        int inChar;
        System.out.println("Enter a Character:");
        do {
            System.out.println("Podaj liczbę nr 1");
            a = scanner.nextInt();

            System.out.println("Podaj symbol operacji");
            z = scanner.next().charAt(0);

            System.out.println("Podaj liczbę nr 2");
            b = scanner.nextInt();

            System.out.println(a * b);
            System.out.println("Zakonczyć program ? type NO or press Enter to exit");
            inChar = System.in.read();
        } while (inChar != 10);

//        try {
//            do {
//                inChar = System.in.read();
//                System.out.print("You entered ");
//                System.out.println(inChar);
//            }while(inChar ==10);
//
//        }
//        catch (IOException e){
//            System.out.println("Error reading from user");
//        }
    }


    //Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią,
    // a następnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
    //podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,15.
    public void zadanie8() {

        int liczba;
        System.out.println("Program wypisuje wszystkie nieparzyste liczby mniejsze od podanej");
        System.out.println("Podaj prosze liczbę całkowitą większą od 0");
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();
        if (liczba <= 0) {
            System.out.println("Podaj prosze liczbę całkowitą większą od 0");
        } else {
            for (int i = 0; i <= liczba; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }

    //Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
    //A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
    //(A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
    //while, do-while, for.
    //Przykład:
    //Dla A = 4 i B = 11 program powinien wyświetlić:
    //60
    //60
    //60
    public void zadanie9() {
        int x, y;
        int sumaFor = 0;
        int sumaDowhile = 0;
        int sumaWhile = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program liczy sumę liczb z przedziału podanego przez użytkownika");
        System.out.println("Podaj pierwszą liczbę");
        x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę która jest większa od pierwszej");
        y = scanner.nextInt();

        for (int i = 0; i + x <= y; i++) {
            sumaFor = sumaFor + x + i;
        }
        System.out.println(sumaFor);

        int j = 0;
        do {
            sumaDowhile = sumaDowhile + x + j;
            j++;
        } while (j + x <= y);
        System.out.println(sumaDowhile);

        int k = 0;
        while (x + k <= y) {
            sumaWhile = sumaWhile + x + k;
            ++k;
        }
        System.out.println(sumaWhile);

    }

    //Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
    //następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
    //liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
    //1
    //2
    //4
    //8
    //16
    //32
    //64
    public void zadanie10() {
        int x, i = 0;
        double y = 1;
        System.out.println("Program wyświetla potęgi liczby 2 mniejsze od podanej przez użytkownika liczby");
        System.out.println("Podaj liczbę całkowitą dodatnią");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        while (y <= x) {
            y = Math.pow(2, i);
            if (y < x) {
                System.out.println(y);
            }
            ++i;
        }
    }

    //Napisać program, który wczytuje liczby podawane przez użytkownika dotąd,
    // dopóki nie podana zostanie liczba 0.
    // Następnie wyświetlić sumę wszystkich podanych liczb.
    public void zadanie11() {
        System.out.println("Program sumuje liczby podane przez użytkownika");
        System.out.println("Praca programu kończy się jeżeli podana zostanie liczba \"0\"");
        int x;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę");
            x = scanner.nextInt();
            suma = suma + x;
        } while (x != 0);
        System.out.println("Suma podanych liczb wynosi: " + suma);
    }

    //Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
    //danych kończone jest podaniem wartości 0 (nie wliczana do danych).
    // W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
    //podanych liczb oraz ich średnią arytmetyczną.
    //Przykład:
    //Użytkownik podał ciąg: 1, -4, 2, 17, 0.
    //Wynik programu:
    //13 // suma min. i maks.
    //6.5 // średnia
    public void zadanie12() {
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        System.out.println("Program wylicza sumę z największej i najmniejszej z podanych liczb oraz oblicza ich średnią arytmetyczną");
        System.out.println("Praca programu kończy się jeżeli podana zostanie liczba \"0\"");
        Scanner scanner = new Scanner(System.in);

        int liczba;
        do {
            liczba = scanner.nextInt();
            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
        } while (liczba != 0);
        System.out.println(max + min + " jest to suma najmniejszej i największej z podanych liczb");
        System.out.println(((max + min) / 2) + " jest to średnia arytmetyczna tych dwóch liczb");
    }

    //Napisać program rysujący w konsoli „obrazek” złożony ze znaków gwiazdki (*).
    // Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą wysokość obrazka (liczbę wierszy).
    //Przykład: dla n = 5 wynik powinien wyglądać następująco:
    //*
    //**
    //***
    //****
    //*****
    public void zadanie13() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość obrazka: ");
        x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = x - i; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
    //(użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych wartości. Jeżeli podana wartość jest:
    //• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
    //• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
    //• identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
    //się kończy.
    public void zadanie14() {
        Random random = new Random();
        int liczba = random.nextInt(100) + 1;
        int zgaduj = 0;
        int liczbaProb = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Musisz zgadnąć jaka to liczba z zakresu od 1 do 100");

        while (zgaduj != liczba) {
            System.out.println("Jak myślisz jaka to liczba z zakresu od 1 do 100 ?");
            zgaduj = scanner.nextInt();
            liczbaProb++;
            if (zgaduj < liczba) {
                System.out.println("Podałeś za małą wartość");
            } else if (zgaduj > liczba) {
                System.out.println("Podałeś za dużą wartość");
            } else {
                System.out.println("Gratulacje");
                System.out.println("Zgadłeś w " + liczbaProb + " próbie");
            }
        }
    }

    //Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie prostokąt.
    // Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego
    //górnego rogu prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
    //że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
    //Przykład: x=6, y=3, a=4, b=6, zn=’x’
    //>
    //>
    //> _____xxxxxx
    //> _____xxxxxx
    //> _____xxxxxx
    //> _____xxxxxx
    //ozn.
    //> - nowa linia,
    //_ - znak spacji.
    public void zadanie15() {
        int x, y, a, b;
        char zn;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne lewego górnego rogu prostokąta wsp x= ");
        x = scanner.nextInt();
        System.out.println("Podaj współrzędne lewego górnego rogu prostokąta wsp y= ");
        y = scanner.nextInt();
        System.out.println("Podaj wysokość prostokąta a= ");
        a = scanner.nextInt();
        System.out.println("Podaj szerokość prostokąta b= ");
        b = scanner.nextInt();
        System.out.println("Podaj znak którym zamalujemy prosotkąt: ");
        zn = scanner.next().charAt(0);
        System.out.println(zn);

        for (int i = 1; i < y; i++) {
            System.out.println("");
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < b; j++) {
                System.out.print(zn);
            }
            System.out.println();
        }
    }

    //Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
    //Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
    //wysokość choinki (liczbę wierszy).
    //Przykład: dla n = 5 wynik powinien wyglądać następująco:
    //    *
    //   ***
    //  *****
    // *******
    //*********
    public void zadanie16() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość choinki: ");
        x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
    //• oblicza sumę cyfr tej liczby,
    //• stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
    //cyfr nieparzystych.
    public void zadanie17() {
        int x, liczbaJednosci = 0, sumaCyfr = 0, licznikParzysty = 0, licznikNieParzysty = 0;
        double sredniaParzystych = 0, sredniaNieParzystych = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją liczbę");
        x = scanner.nextInt();

        while (x != 0) {
            liczbaJednosci = x % 10;
            sumaCyfr += liczbaJednosci;
            if (liczbaJednosci % 2 == 0) {
                sredniaParzystych += liczbaJednosci;
                licznikParzysty++;
            }
            if (liczbaJednosci % 2 != 0) {
                sredniaNieParzystych += liczbaJednosci;
                licznikNieParzysty++;
            }
            x = x / 10;
        }
        System.out.println("Suma cyfr podanej liczby wynosi: " + sumaCyfr);
        System.out.println("średnia arytmetyczna liczb parzystych wynosi: " + sredniaParzystych / licznikParzysty);
        System.out.println("średnia arytmetyczna liczb nieparzystych wynosi: " + sredniaNieParzystych / licznikNieParzysty);
        System.out.println("Storunek średnich wynosi: " + (sredniaParzystych / licznikParzysty) / (sredniaNieParzystych / licznikNieParzysty));
    }


    //Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
    // Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
    public void zadanie18() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program służy do wyświeltenia liczników podanej przez urzytkownika liczby");
        System.out.println("Podaj swoją liczbę");
        x = scanner.nextInt();
        ArrayList<Integer> dzielniki = new ArrayList<Integer>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                dzielniki.add(i);
            }
        }
        System.out.print(dzielniki);
    }

    //Napisać program, który sprawdza, czy podana liczba całkowita n, n > 1, jest
    //liczbą pierwszą.
    public void zadanie19() {
        int x, dzielniki = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program służy do sprawdzenia czy podana przez urzytkownika liczba jest liczbą pierwszą");
        System.out.println("Podaj swoją liczbę całkowitą większą od 1");
        x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                dzielniki++;
            }
        }

        if (dzielniki == 2) {
            System.out.println("Podana liczba " + x + " jest liczbą pierwszą");
        } else {
            System.out.println("Liczba " + x + " nie jest liczbą pierwszą");
        }
    }

    //Napisać program, który:
    //• utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
    //przedziału [−10, . . . , 10],
    //• wypisze na ekranie zawartość tablicy,
    //• wyznaczy najmniejszy oraz najwięszy element w tablicy,
    //• wyznaczy średnią arytmetyczną elementów tablicy,
    //• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
    //• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
    //Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
    //Wylosowane liczby:
    //-3 9 2 -10 -3 -4 -1 -5 -10 8
    //Min: -10, max: 9
    //Średnia: -1,00
    //Mniejszych od śr.: 6
    //Większych od śr.: 3
    //Liczby w odwrotnej kolejności:
    //8 -10 -5 -1 -4 -3 -10 2 9 -3
    public void zadanie20() {
        int[] tab = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sumaLiczb = 0;
        double srednia;
        int liczWiekszeSrednia = 0;
        int liczMniejszeSrednia = 0;
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(20) - 10;
            if (tab[i] < min) {
                min = tab[i];
            }
            if (tab[i] > max) {
                max = tab[i];
            }
            sumaLiczb += tab[i];
        }

        srednia = (double) sumaLiczb / (double) tab.length;

        for (int x : tab) {
            if (x > srednia) {
                liczWiekszeSrednia++;
            }
            if (x < srednia) {
                liczMniejszeSrednia++;
            }
        }

        System.out.println("Wylosowane liczby: ");
        for (int k : tab) {
            System.out.print(k + ", ");
        }
        System.out.println();
        System.out.println("Min: " + min + " max: " + max);
        System.out.println("średnia: " + srednia);
        System.out.println("Mniejszych od śr: " + liczMniejszeSrednia);
        System.out.println("Większych od śr: " + liczWiekszeSrednia);
        System.out.println("Liczby w odwrotnej kolejności");

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + ", ");
        }
    }

    //Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
    //a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
    //się w tablicy.
    //Przykład:
    //Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
    //Wystąpienia:
    //1 - 1
    //2 - 1
    //3 - 3
    //4 - 3
    //5 - 3
    //6 - 4
    //7 - 1
    //8 - 2
    //9 - 0
    //10 - 2
    public void zadanie21() {
        int[] tab = new int[20];
        HashMap<Integer, Integer> results = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10) + 1;
            if (results.containsKey(tab[i])) {
                results.put(tab[i], results.get(tab[i]) + 1);
            } else {
                results.put(tab[i], 1);
            }
        }

        System.out.println("Wylosowane liczby");
        for (int j : tab) {
            System.out.print(j + ", ");
        }
        System.out.println();
        System.out.println("Wystąpienia");
        for (int i = 1; i <= 10; i++) {
            if (results.containsKey(i)) {
                System.out.println(i + "___-> " + results.get(i));
            } else {
                System.out.println(i + "___-> 0");
            }
        }
    }

    //Napisz program, który:
    //• stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
    //• wypełnij ją losowymi wartościami z zakresu {−5, −4, . . . , 5},
    //• dla każdej kolumny wyznacz minimum,
    //• dla każdej kolumny wyznaczy maksimum.
    //Program ma wyświetlać tablicę wypełnioną liczbami oraz tablice z minimami oraz
    //maksymami.
    public void zadanie22() {
        int[][] tab = new int[5][5];
        int[] mintab = new int[]{10, 10, 10, 10, 10};
        int[] maxtab = new int[]{-10, -10, -10, -10, -10};
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(11) - 5;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print("[" + tab[i][j] + "] ");
                if (tab[i][j] > maxtab[j]) {
                    maxtab[j] = tab[i][j];
                }
                if (tab[i][j] < mintab[j]) {
                    mintab[j] = tab[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Minimalne wartości w poszczególnych kolumnach");
        for (int x : mintab) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("Maksymalne wartości w poszczególnych kolumnach");
        for (int x : maxtab) {
            System.out.print(x + ", ");
        }
    }

    //Napisz program, który pobiera od użytkownika dodatnią liczbę naturalną n i
    //tworzy tablicę a zmiennych typu logicznego (boolean) o rozmiarze n×n. Następnie
    //program powinien wypełnić utworzoną tablicę, tak by a[i][j] = true jeżeli liczby
    //(i+1) oraz (j+1) są względnie pierwsze, tzn. nie mają wspólnych dzielników poza
    //1. Tak utworzoną tablicę należy wypisać na ekranie, przy czym dla wartości true
    //należy wyświetlić znak ”+”, natomiast dla wartości false znak ”.”. Przykład:
    //Podaj liczbę (> 0): 10
    //  1 2 3 4 5 6 7 8 9 10
    //1 + + + + + + + + + +
    //2 + . + . + . + . + .
    //3 + + . + + . + + . +
    //4 + . + . + . + . + .
    //5 + + + + . + + + + .
    //6 + . . . + . + . . .
    //7 + + + + + + . + + +
    //8 + . + . + . + . + .
    //9 + + . + + . + + . +
    //10 + . + . . . + . + .
    // metoda do obliczenia NWD
    static int nwd(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return a;
    }

    public void zadanie23() {
        System.out.println("Podaj liczbe naturalna większą od \"0\"");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean[][] a = new boolean[x][x];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (nwd(i + 1, j + 1) == 1) {
                    System.out.print("+");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    //Napisać program, który wczytuje od użytkownika ciąg znaków,
    // a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
    //Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
    //ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
    //razy.
    public void zadanie24() {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakieś słowo a program policzy ile razy powtarza się jego ostatni znak");
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1)) {
                counter++;
            }
        }
        System.out.println("Literka :" + word.charAt(word.length() - 1) + " w słowie " + word + " występuje " + counter + " razy");
    }

    //Napisać program, który wczytuje od użytkownika ciąg znaków,
    //a następnie tworzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
    //Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.
    public void zadanie25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program wyświetla łańcuch będący odwróceniem podanego przez użytkownika");
        String word = scanner.next();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    //Napisać program, który wczytuje od użytkownika ciąg znaków,
    // a następnie sprawdza, czy podany ciąg jest palindromem.
    public void zadanie26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program sprawdza czy podane słowo jest palindromem");
        String word = scanner.next();
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                counter++;
            }
        }
        if (counter == word.length()) {
            System.out.println("Podane słowo jest palindromem");
        } else System.out.println("Niestety podane słowo nie jest palindromem");
    }

    //Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
    //Przykład:
    //"Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
    //Wynik:
    //6
    public void zadanie27() {
        String word = "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi.";
        System.out.println("Program sumuje cyfry w podanym tekscie");
        int suma = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 48 && word.charAt(i) <= 57) {
                suma += word.charAt(i) % 48;
            }
        }
        System.out.println(suma);
    }

    //Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
    //arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
    //pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.
    //Przykład a:
    //"2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
    //Wynik:
    //Błędne sparowanie nawiasów
    //Przykład b:
    //"2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
    //Wynik:
    //OK
    public void zadanie28() {
        String a = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))";
        String b = "2 * (3.4 - (-7)/2)*(a-2)/(b-1))";
        System.out.println("Program sprawdza czy nawiasy okrągłe są poprawnie sparowane w wyrażeniu arytmetycznym");
        int ile = 0;
        for (int i = 0; i < a.length(); i++) {
            //kod ASCII dla "(" wynosi 40
            if (a.charAt(i) == 40) {
                ile++;
            }
            if (a.charAt(i) == 41) {
                ile--;
            }
        }
        if (ile == 0) {
            System.out.println("Parowanie nawiasów jest ok");
        } else System.out.println("Błędne sparowanie nawiasów");
    }

    //Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu szyfru Cezara,
    // który jest szczególnym przypadkiem szyfru podstawieniowego
    //monoalfabetycznego.
    //Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n,
    // o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
    //przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
    //tj. ’a’ – ’z’ (26 znaków) oraz spacji.
    //Przykład 1.
    //Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
    //Podaj przesunięcie: 2
    //Zaszyfrowany tekst: cdtcmcfcdtcb
    //Przykład 2.
    //Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
    //Podaj przesunięcie: -2
    //Zaszyfrowany tekst: abrakadabraz
    public void zadanie29() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program szyfruje podane przez użytkowanika słowo");
        System.out.println("Podaj słowo");
        String word = scanner.next();
        System.out.println("Podaj liczbe szyfrującą");
        int x = scanner.nextInt();
        int helper;
        for (int i = 0; i < word.length(); i++) {
            helper = word.charAt(i) + x % 26;
            if (helper > 122) {
                helper -= 26;
            }
            if (helper < 97) {
                helper += 26;
            }
            System.out.print((char) helper);
        }
    }

    //Napisz funkcję, która zwraca wartość silni dla podanej liczby n. Funkcja powinna
    //być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
    static int silniaR(int a) {
        if (a == 0) return 1;
        a *= silniaR(a - 1);
        return a;
    }

    static int silniaI(int a) {
        int iloczyn = 1;
        for (int i = 1; i <= a; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }

    public void zadanie30() {
        int x = 10;
        System.out.println(silniaR(x));
        System.out.println(silniaI(x));
    }

    //Napisz funkcję, która zwraca wartość n-tego wyrazu ciągu Fibonacciego. Funkcja
    //powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
    //Ciąg Fibonacciego dany jest wzorem:
    //Fn =
    //0 gdy n = 0 ,
    //1 gdy n = 1 ,
    //Fn−2 + Fn−1 gdy n > 1 .
    static int fibonacciR(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        a = fibonacciR(a - 2) + fibonacciR(a - 1);
        return a;
    }

    static int fibonacciI(int a) {
        if (a < 2) return a;
        int elementA = 0;
        int elementB = 1;
        int wynik = 0;

        for (int i = 2; i <= a; i++) {
            wynik = elementA + elementB;
            elementA = elementB;
            elementB = wynik;
        }
        return wynik;
    }

    public void zadanie31() {
        int x = 10;
        System.out.println(fibonacciR(x));
        System.out.println(fibonacciI(x));
    }

    //Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks
    //na którym znajduje się znak z (drugi parametr) w podanym łańcuchu text .
    //Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1.
    //Uwaga - pozycje znaków numerujemy począwszy od 0.
    static int strpos(String text, char z) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == z) return i;
        }
        return -1;
    }

    public void zadanie32() {
        System.out.println(strpos("dupa_blada", 'a'));
        System.out.println(strpos("zagdka", 'y'));
    }

    //Napisać funkcję String flipCase(String text) , która zamieni małe litery na
    //duże i odwrotnie w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch
    //znaków zawierający kopię łańcucha po zmianie wielkości liter.
    static String flipCase(String text) {
        StringBuilder helper = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 65 && text.charAt(i) > 90) {
                helper.append((char) (text.charAt(i) - 32));
            } else
                helper.append((char) (text.charAt(i) + 32));
        }

        return helper.toString();
    }

    public void zadanie33() {
        System.out.println(flipCase("Zadanie"));
        System.out.println(flipCase("zALICZONE"));
    }

    //Zdefiniować funkcję boolean startsWith(String str1, String str2) , która
    //sprawdza, czy łańcuch str2 jest prefiksem łańcucha str1 .
    //Przykłady:
    //startsWith("Alibaba", "Ali") - wynik true, ponieważ wyraz
    //"Alibaba" zaczyna się wyrazem "Ali".
    //startsWith("Alibaba", "Alibaba") - wynik true, ponieważ wyraz jest
    //zawsze swoim prefiksem.
    //startsWith("Kot", "Pies") - wynik false, ponieważ wyraz "Pies"
    //nie jest prefiksem wyrazu "Kot"
    static boolean startsWith(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        return (str1.substring(0, str2.length()).equals(str2));
    }

    public void zadanie34() {
        System.out.println(startsWith("Alibaba", "Ali"));
        System.out.println(startsWith("Alibaba", "Alibaba"));
        System.out.println(startsWith("Kot", "Pies"));

    }

    //Zdefiniować funkcję int strToInt(String str) ,
    // która zamienia liczbę całkowitą zapisaną w postaci łańcucha na liczbę całkowitą typu int.
    // Funkcja powinna przerywać konwersję w momencie napotkania pierwszego znaku nie należącego do
    //zapisu liczby, zatem np. dla strToInt("-13krowa") wynikiem powinno być -13.
    //Pozostałe przykłady:
    //strToInt("+12") - wynik 12
    //strToInt("0001") - wynik 1
    //strToInt("991-234-23") - wynik 991
    //strToInt("+zonk") - wynik 0
    //strToInt("") - wynik 0
    //strToInt("-12e5") - wynik -12*10^5 = -120000
    //strToInt("-12e-5") - wynik -12, tylko dodatnie wykładniki są rozpatrywane
    public static int strToInt(String str) {
        int results = 0;
        boolean negative = false;

        if (str.length() == 0) {
            return results;
        } else {
            if (str.charAt(0) == '-') {
                negative = true;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                    continue;
                }
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    results = (results * 10) + str.charAt(i) % 48;
                } else break;
            }
        }
        if (negative) {
            return -results;
        } else {
            return results;
        }
    }

    public void zadanie35() {
        System.out.println(strToInt("+12"));
        System.out.println(strToInt("0001"));
        System.out.println(strToInt("991-234-23"));
        System.out.println(strToInt("+zonk"));
        System.out.println(strToInt(""));
        System.out.println(strToInt("-12e5"));
    }

    //Zdefiniować funkcję int strfind(String gdzie, String co) ,
    // która szuka łańcucha co w łańcuchu gdzie i jeżeli go znajdzie, to jej wynikiem jest pozycja,
    //na której ten łańcuch zaczyna się w łańcuchu gdzie . Jeżeli nie udało się znaleźć
    //łańcucha to wtedy wynikiem ma być -1.
    //Przykłady:
    //strfind("Ala ma kota", "ma") - wynik to 4
    //strfind("Ala ma kota", "Ala ma kota") - wynik to 0
    //strfind("Ala ma kota", "") - wynik to 0, bo pusty łańcuch jest
    //podłańcuchem każdego innego łańcucha
    //strfind("Pies", "jakis napis") - wynik to -1
    //strfind("Ala ma kota", "pies") - wynik to -1
    public static int strfind(String gdzie, String co) {
        int counter = 0;
        if (co.equals("")) return 0;
        if (gdzie.length() == 0 || co.length() == 0) return -1;
        if (gdzie.length() < co.length()) return -1;
        for (int i = 0; i < gdzie.length(); i++) {
            if (gdzie.charAt(i) == co.charAt(0)) {
                for (int j = 0; j < co.length(); j++) {
                    if (i + j == gdzie.length()) return -1;
                    if (gdzie.charAt(i + j) == co.charAt(j)) {
                        counter++;
                    }
                }
            }
            if (counter == co.length()) return i;
        }
        return -1;
    }

    public void zadanie36() {
        System.out.println(strfind("Ala ma kota", "ma"));
        System.out.println(strfind("Ala ma kota", "Ala ma kota"));
        System.out.println(strfind("Ala ma kota", ""));
        System.out.println(strfind("Pies", "jakis napis"));
        System.out.println(strfind("Ala ma kota", "pies"));
    }

    //Napisać funkcję int wordCount(String text) ,
    // której wynikiem jest liczba wszystkich słów występujących w podanym jako parametr tekście.
    // Do sprawdzania, czy
    //dany znak tekstu jest „białym znakiem” można zastosować metodę
    //Character.isWhitespace . Za słowo przyjmujemy każdy ciąg znaków niezawierający białego znaku.
    public static int wordCount(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                counter++;
            } else if (i == text.length() - 1) {
                counter++;
            }
        }
        return counter;
    }

    public void zadanie37() {
        String str = "Strasznie dobry program napisalem_wynik działania powinno byc 8";
        System.out.println(wordCount(str));
        System.out.println("Teraz sprawdzenie wbudowana metoda:");
        int j = 0;
        for (String i : str.split(" ")) {
            j++;
        }
        System.out.println(j);
    }

    //Napisać funkcję String[] podzielNaSlowa(String tekst) ,
    // która dzieli podany tekst na słowa i zapisuje je w tablicy.
    // Wynikiem funkcji jest tablica zawierające
    //kolejno słowa z tekstu. Za słowo przyjmujemy każdy ciąg znaków niezawierający
    //białego znaku.
    public static String[] podzielNaSlowa(String text) {
        String[] tabOfWord = new String[wordCount(text)];
        int a = 0;
        int c = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                tabOfWord[c] = text.substring(a, i);
                a = i + 1;
                c++;
            } else if (i == text.length() - 1) {
                tabOfWord[c] = text.substring(a, i + 1);
            }
        }
        return tabOfWord;
    }

    public void zadanie38() {
        String str = "Strasznie dobry program napisalem_wynik działania powinno byc 8";
        System.out.println("ile powinno być słów ?");
        System.out.println(podzielNaSlowa(str).length);
        System.out.println("Oto i one:");
        System.out.println();
        for (String word : podzielNaSlowa(str)) {
            System.out.println(word);
        }
        System.out.println();
        System.out.println("Metoda dla zaawansowanych");
        for (String i : str.split(" ")) {
            System.out.println(i);
        }

    }
}

