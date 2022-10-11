package it.Java;

import it.Java.Evento.Evento;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String titolo;
        LocalDate data;
        int giorno;
        int mese;
        int anno;
        int numPosti;
        Evento evento;


        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un nuovo Evento : ");
        System.out.print("Come si chiama?");
        titolo = in.nextLine();
        System.out.println("Quando si fa?");
        System.out.print("che giorno?");
        giorno = in.nextInt();
        System.out.print("che mese?");
        mese = in.nextInt();
        System.out.print("che anno?");
        anno = in.nextInt();
        data = LocalDate.of(anno, mese, giorno);
        System.out.print("Quanti posti massimi?");
        numPosti = in.nextInt();
        evento = new Evento(titolo,data,numPosti);





        System.out.println("Hello world!");
    }
}