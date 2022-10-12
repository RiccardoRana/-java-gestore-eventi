package it.Java;

import it.Java.Evento.Evento;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String titolo, rispostaPren, rispostaDis;
        LocalDate data;
        int giorno;
        int mese;
        int anno;
        int numPosti, rispostaPrenNum, rispostaDisNum;
        Evento evento;


        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un nuovo Evento : ");
        System.out.print("Come si chiama?");
        titolo = in.nextLine();
        System.out.println("Quando si fa?");
        System.out.print("che giorno?");
        giorno = in.nextInt();
        in.nextLine();
        System.out.print("che mese?");
        mese = in.nextInt();
        in.nextLine();
        System.out.print("che anno?");
        anno = in.nextInt();
        in.nextLine();
        data = LocalDate.of(anno, mese, giorno);
        System.out.print("Quanti posti massimi?");
        numPosti = in.nextInt();
        in.nextLine();

        try {
            evento = new Evento(titolo, data, numPosti);

            System.out.print("Vuoi effettuare delle prenotazioni?");
            rispostaPren = in.nextLine();
            if (rispostaPren.equalsIgnoreCase("si")) {
                System.out.print("Quante vuoi farne?");
                rispostaPrenNum = in.nextInt();
                in.nextLine();
                try {
                    evento.prenotaPosto(rispostaPrenNum);
                } catch (Exception e) {
                    System.out.println("Non puoi più prenotare!");
                }
                System.out.println("Evento prenotato, posti disponibili:" + evento.getNumPosti() + ", posti prenotati:" + evento.getNumPostiPren() + "");
                System.out.print("Vuoi fare qualche disdetta?");
                rispostaDis = in.nextLine();
                if (rispostaDis.equalsIgnoreCase("si")) {
                    System.out.print("Quante vuoi farne?");
                    rispostaDisNum = in.nextInt();
                    in.nextLine();
                    try {
                        evento.riduciPosto(rispostaDisNum);
                        System.out.println("Disdetta effettuata ed evento prenotato, posti disponibili:" + evento.getNumPosti() + ", posti prenotati:" + evento.getNumPostiPren() + "");

                    } catch (Exception e) {
                        System.out.println("Non puoi disdire!");
                    }
                } else {
                    System.out.println("Evento prenotato, posti disponibili:" + evento.getNumPosti() + ", posti prenotati:" + evento.getNumPostiPren() + "");
                    in.close();
                }
            }


        } catch (Exception e) {
            System.out.println("Date non valide!");
        }


    }
}