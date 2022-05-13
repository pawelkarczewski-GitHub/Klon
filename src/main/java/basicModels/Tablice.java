package basicModels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {

         /*  int[] ratings = new int[3];
        ratings[0]=5;
        ratings[1]=6;
        ratings[2]=9;
        int ratingValue = ratings[2];
        System.out.println("Rating filmu 3 to: " + ratingValue);*/


        //problem listy bez określenia typu
        //1 krok, przykład metody dla String
         /*String imie = "Darek";
        System.out.println(imie.toUpperCase());*/

        //2 krok - lista bez typu, nie można wykonać operacji na string
      /*  List lista = new ArrayList();
        lista.add("Darek");
        lista.add("Salma");
        lista.add("5");
        for (Object o : lista) {
            o.toUpperCase();
        }*/

        //3 krok - lista bez typu, można dodać dowolne typy danych
      /*  List lista = new ArrayList();
        lista.add("Darek");
        lista.add("Salma");
        lista.add(5);
        lista.add(true);
        lista.add(20.99);


        for (Object o : lista) {
            o.toUpperCase();
        }*/

        //4 krok - lista z okreśłeniem typu, pokazuje błąd gdy dodany jest inny typ, wykonują się operacje na String
      /*  List<String> lista = new ArrayList();
        lista.add("Darek");
        lista.add("Salma");
        lista.add(5);
        lista.add(true);
        for (String element : lista) {
            element.toUpperCase();
        }*/



        //Zadanie5
       /* String movie[] = {"Forrest Gump", "Zielona Mila", "Top Gun"};
        int ratings[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oto 3 filmy: Podaj proszę Twoją ocenę każdego z nich:");
        //Pierwszy film
        System.out.println("Pierwszy film to: " + movie[0]);
        System.out.println("Jak go oceniasz? ");
        ratings[0]= scanner.nextInt();
        //Drugi film
        System.out.println("Drugi film to: " + movie[1]);
        System.out.println("Jak go oceniasz? ");
        ratings[1]= scanner.nextInt();
        //Trzeci film
        System.out.println("Trzeci film to: " + movie[2]);
        System.out.println("Jak go oceniasz? ");
        ratings[2]= scanner.nextInt();
        //Podsumowanie
        System.out.println("Podsumowanie Twojego rankingu: ");
        System.out.println("Film " + movie[0] + " oceniasz na " + ratings[0]);
        System.out.println("Film " + movie[1] + " oceniasz na " + ratings[1]);
        System.out.println("Film " + movie[2] + " oceniasz na " + ratings[2]);*/

        //Kolorki
       /* String colorReset = "\u001B[0m";
        String colorRed = "\u001B[31m";
        String colorGreen = "\u001B[32m";
        String colorYellow = "\u001B[33m";
        System.out.println("Kolor czarny w konsoli " + colorGreen + "kolor zielony " + colorReset + "znów kolor czarny " +
                "Dalsza część tekstu w kolorze czarnym" + colorRed + " a teraz coś na czerwono");*/

        //Zadanie 6
      /*  List<String> movieList = List.of("Forrest Gump", "Zielona Mila", "Top Gun");
        List<Integer> ratings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oto 3 filmy: Podaj proszę Twoją ocenę każdego z nich:");
        //Pierwszy film
        System.out.println("Pierwszy film to: " + movieList.get(0));
        System.out.println("Jak go oceniasz? ");
        ratings.add(scanner.nextInt());
        //Drugi film
        System.out.println("Drugi film to: " + movieList.get(1));
        System.out.println("Jak go oceniasz? ");
        ratings.add(scanner.nextInt());
        //Trzeci film
        System.out.println("Trzeci film to: " + movieList.get(2));
        System.out.println("Jak go oceniasz? ");
        ratings.add(scanner.nextInt());
        //Podsumowanie
        System.out.println("Podsumowanie Twojego rankingu: ");
        System.out.println("Film " + movieList.get(0) + " oceniasz na " + ratings.get(0));
        System.out.println("Film " + movieList.get(1) + " oceniasz na " + ratings.get(1));
        System.out.println("Film " + movieList.get(2) + " oceniasz na " + ratings.get(2));*/

        //Zadanie 7
       /* System.out.println("Ile jest sekund do wybuchu? ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        for (int i = seconds; i >= 0; i--) {
            System.out.println("Bomba wybuchnie za " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Bummmmmmmmm !#!@#!#!#!@#");*/

        //Zadanie 7
     /*   System.out.println("Ile jest sekund do wybuchu? ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        while (seconds >= 0) {
            System.out.println("Bomba wybuchnie za " + seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
        }
        System.out.println("Bummmmmmmmm !#!@#!#!#!@#");*/

        //Zadanie 7
     /*   System.out.println("Ile jest sekund do wybuchu? ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        do {
            System.out.println("Bomba wybuchnie za " + seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
        }
        while (seconds >= 0);
        System.out.println("Bummmmmmmmm !#!@#!#!#!@#");*/

        //Zadanie 8
       /* int[] tablica = new int[101];
        for (int i = 0; i <= 100; i++) {
            tablica[i] = i;
        }
        System.out.println("Rozmiar przygotowanej tablicy to: " + tablica.length);
        System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<");
        for (int i : tablica) {
            tablica[i] = tablica[i] * 2;
        }

         for (int i : tablica) {
            System.out.println("Element tablicy  to " + i);
         }*/
    }
}





